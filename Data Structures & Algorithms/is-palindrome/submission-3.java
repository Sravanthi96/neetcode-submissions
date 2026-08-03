class Solution {
    public boolean isPalindrome(String s) {
        String copy = s.replaceAll("\\s+","");
        String str = copy.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l =0;
        int r = str.length()-1;
        while(l<r) {
            if(str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            }else {
                return false;
            }
        }
        return true;
    }
}
