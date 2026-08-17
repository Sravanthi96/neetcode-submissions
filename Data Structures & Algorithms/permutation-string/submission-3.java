class Solution {
    //optimal
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        for(int i =0 ; i < s1.length();i++) {
            s1Freq[s1.charAt(i)-'a']++;
            s2Freq[s2.charAt(i)-'a']++;
        }
        int matches = 0;
        for(int i=0;i < 26;i++) {
            if(s1Freq[i] == s2Freq[i]){
                matches++;
            }
        }
        int l  = 0;
        for(int r = s1.length() ; r < s2.length();r++) {
            if(matches == 26) {
                return true;
            }
            int index = s2.charAt(r) - 'a';
            s2Freq[index]++;
            if(s1Freq[index] == s2Freq[index]) {
                matches++;
            } else if(s1Freq[index] + 1 == s2Freq[index]){
                matches--;
            }
            index = s2.charAt(l) - 'a';
            s2Freq[index]--;
            if(s1Freq[index] == s2Freq[index]) {
                matches++;
            }else if(s1Freq[index] - 1 == s2Freq[index]){
                matches--;
            }
            l++;
        }
        return matches == 26;
    }
}
