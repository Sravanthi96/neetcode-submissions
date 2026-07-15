class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            for(int j= 0 ; j < length; j++) {
                int diff = target - nums[j];
                if(diff == nums[i] && i != j) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }
}
