class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()) {
            return false;
         }
         String slower = s.toLowerCase();
         String tlower = t.toLowerCase();
         int[] freq = new int[26];
         for(int i=0; i < s.length() ; i++) {
            freq[slower.charAt(i) - 'a']++;
            freq[tlower.charAt(i) - 'a']--;
         }
         for(int count : freq) {
            if(count !=0) {
                return false;
            }
         }
        return true;
    }
}
