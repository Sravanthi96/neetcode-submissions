class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder(word1.length() + word2.length());
        int l = 0;
        int r = 0;
        while(l < word1.length() || r < word2.length()) {
            if(l < word1.length()){
                result.append(word1.charAt(l));
                l++;
            }
            if(r < word2.length()){
                result.append(word2.charAt(r));
                r++;
            }
        }
        return result.toString();
    }
}