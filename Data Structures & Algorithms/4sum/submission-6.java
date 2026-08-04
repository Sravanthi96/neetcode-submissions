class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>  result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length;i++) {
            if( i > 0 && nums[i-1] == nums[i]){
                continue;
            }
            for(int j = i+1 ; j < nums.length;j++) {
                if(j > i+1 && nums[j-1] == nums[j]){
                    continue;
                }
                int l = j+1;
                int r = nums.length-1;
                while(l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum > target) {
                        r--;
                    } else if (sum < target) {
                        l++;
                    }else {
                        result.add(List.of(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                        while(l < r && nums[l-1] == nums[l]) {
                            l++;
                        }
                        while(l<r && nums[r+1] == nums[r]){
                            r--;
                        }
                    }
                }
            }
        }
        return result;
    }
}