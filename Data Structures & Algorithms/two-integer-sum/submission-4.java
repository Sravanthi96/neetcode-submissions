class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < length; i++) {
            map.put(nums[i] , i);
        }
        for(int i = 0; i < length; i++) {
           int diff = target - nums[i];
           if(map.containsKey(diff) && map.get(diff) != i){
                return new int[]{i,map.get(diff)};
           }
        }
        return new int[2];
    }
}
