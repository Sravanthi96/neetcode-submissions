class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        while(r < s.length()) {
            freq[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);
            int changes = (r-l+1) - maxFreq;
            if(changes <= k) {
                maxLength = Math.max(maxLength , (r-l+1));
            } else {
                maxFreq = 0;
                freq[s.charAt(l) - 'A']--;
                maxFreq = freq[s.charAt(l) - 'A'];
                l++;
            }
            r++;
        }
        return maxLength;
    }
}
