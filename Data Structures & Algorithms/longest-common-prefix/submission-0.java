class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix ="";
        List<Character> result = new ArrayList<Character>();
        prefix = strs[0]; 
        for(int i=1;i<strs.length;i++) {
            int leng = 0;
            for(int j = 0 ; j < strs[i].length() && j < prefix.length();j++){
                if(strs[i].charAt(j) == prefix.charAt(j)){
                    leng++;
                }else {
                    break;
                }
            }
            System.out.println("length" + leng);
            prefix = prefix.substring(0,leng);
        }
        return prefix;
    }
}