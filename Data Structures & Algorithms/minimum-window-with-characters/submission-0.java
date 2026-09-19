class Solution {
    public String minWindow(String s, String t) {
                if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> required = new HashMap<>();

        for (char ch : t.toCharArray()) {
            required.put(ch, required.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();

        int requiredCharacters = required.size();
        int formedCharacters = 0;

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int resultStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            window.put(
                rightChar,
                window.getOrDefault(rightChar, 0) + 1
            );

            if (required.containsKey(rightChar)
                    && window.get(rightChar).intValue()
                    == required.get(rightChar).intValue()) {
                formedCharacters++;
            }

            while (formedCharacters == requiredCharacters) {
                int windowLength = right - left + 1;

                if (windowLength < minLength) {
                    minLength = windowLength;
                    resultStart = left;
                }

                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

                if (required.containsKey(leftChar)
                        && window.get(leftChar) < required.get(leftChar)) {
                    formedCharacters--;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(resultStart, resultStart + minLength); 
    }
}
