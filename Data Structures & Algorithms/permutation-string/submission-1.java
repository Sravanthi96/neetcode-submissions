class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int r = s1.length();
        boolean result = false;
        while(r <= s2.length()) {
            String substring = s2.substring(l,r);
            result = matchString(s1,substring);
            if(result) {
                break;
            }else{
                l++;
                r++;
            }
        }
        return result;
    }
    private boolean matchString(String s1, String s2) {
        int[] freq = new int[26];
        for(char c : s1.toCharArray()) {
            freq[c-'a']++;
        }
        for(char c : s2.toCharArray()) {
            freq[c-'a']--;
        }
        int count = 0;
        for(int c : freq){
            if(c != 0) {
                return false;
            }
        }
        return true;
    }
}
