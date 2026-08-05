class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 0;
        nums[x] = nums[0];
        x++;
        for(int i = 1; i<=nums.length - 1;i++) {
            if(nums[i] != nums[i-1]) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }
}