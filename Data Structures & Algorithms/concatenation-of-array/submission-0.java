class Solution {
    public int[] getConcatenation(int[] nums) {
        int leng = nums.length;
        int[] result = new int[leng*2];
        for(int i=0 ;i < leng;i++){
            result[i] = nums[i];
        }
        for(int i=0 ;i < leng;i++){
            result[i+leng] = nums[i];
        }
        return result;
    }
}