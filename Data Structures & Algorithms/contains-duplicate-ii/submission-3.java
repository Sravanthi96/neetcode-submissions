class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length;i++) {
            if(map.containsKey(nums[i])){
                int diff = Math.abs(i - map.get(nums[i]));
                if(diff <= k) {
                    result = true;
                    continue;
                }
                map.put(nums[i],i);
            } else {
                map.put(nums[i] , i);
            }
        }
        return result;
    }
}