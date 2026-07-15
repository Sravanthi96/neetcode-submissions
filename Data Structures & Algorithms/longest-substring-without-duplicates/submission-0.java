class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result =0;
        HashSet<Character>  res = new HashSet<Character>();   
        int l = 0;
        for(int r=0 ; r< s.length();r++) {
            while(res.contains(s.charAt(r))) {
                res.remove(s.charAt(l));
                l++;
            }
            res.add(s.charAt(r));
            result = Math.max(result , r-l+1);


        }

        return result;
    }
}
