class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        for(int i = length- 1, j = 0; i >= length / 2; i--,j++) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }   
    }
}