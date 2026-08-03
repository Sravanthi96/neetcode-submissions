class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int l =0;
        int r = str.length()-1;
        while(l<r) {
            if(!Character.isLetterOrDigit(str.charAt(l))) {
                l++;
            }else if(!Character.isLetterOrDigit(str.charAt(r))){
                r--;
            }else if(str.charAt(l) == str.charAt(r)){
                l++;
                r--;
            }else {
                return false;
            }
        }
        return true;
    }
}
