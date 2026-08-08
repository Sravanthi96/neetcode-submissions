class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0;i < nums.length;i++) {
            for(int j = i+1; j < nums.length;j++) {
                int diff = Math.abs(i-j);
                if(nums[i] == nums[j] && diff <= k){
                    return true;
                }
            }
        }
        return false;
    }
}