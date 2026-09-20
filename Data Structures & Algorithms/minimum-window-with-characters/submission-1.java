class Solution {
    public String minWindow(String s, String t) {
         if(s.length() == 0 || t.length() == 0) {
            return "";
         }
         Map<Character,Integer> required = new HashMap<>();
         for(char c : t.toCharArray()){
            required.put(c,required.getOrDefault(c,0) + 1);
         }

         Map<Character,Integer> window = new HashMap<>();
         int requiredChar = required.size();
         int formedChar = 0;
         int left = 0;
         int minlength = Integer.MAX_VALUE;
         int restart = 0;

         for(int right = 0; right < s.length() ; right++) {
            char rightChar = s.charAt(right);
            window.put(rightChar,window.getOrDefault(rightChar,0) +1);
            if(required.containsKey(rightChar) &&  window.get(rightChar).intValue() == required.get(rightChar).intValue()){
                    formedChar++;
                }
            while(formedChar == requiredChar) {
                int windowLength = right-left+1;
                 if(minlength > windowLength) {
                    minlength = windowLength;
                    restart = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
               
                if(required.containsKey(leftChar) && window.get(leftChar).intValue() < required.get(leftChar).intValue()){
                    formedChar--;
                }
                left++;
            }

         }
         return minlength == Integer.MAX_VALUE  ? "" : s.substring(restart,restart + minlength);
    }
}
