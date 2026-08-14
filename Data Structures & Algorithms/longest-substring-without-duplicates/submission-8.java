class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        if(s.equals(" ") || s.length() == 1){
            return 1;
        }
        int result = 0;
        Set<Character> set = new HashSet<Character>();
        int l = 0;
        int r = 0;
        while(r < s.length()) {
            if(set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            } else{
                set.add(s.charAt(r));
                r++;
            }
            result = Math.max(result, set.size());
        }
        return result;
    }
}
