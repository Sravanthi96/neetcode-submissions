class Solution {
    public boolean isPalindrome(String s) {
        
        String  reString = s.replaceAll("\\s+","");
        String  res = reString.replaceAll("\\W+","");
        String rep = res.toLowerCase();
        String[]  str = rep.split("");
        int leng = str.length;
        String[]  left = new String[leng];
        for(int i=0,j=leng-1; j >= 0;i++,j--){
            if(!str[i].equalsIgnoreCase(str[j])){
                return false;
            }
            left[i] = str[j];
        }
        return true;
    }
}
