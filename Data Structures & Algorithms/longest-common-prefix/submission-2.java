class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix = strs[0];
       for(int i = 0 ;i <prefix.length();i++){
            char ch = prefix.charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return prefix.substring(0,i);
                }
            }
       }
       return prefix;
    }
}