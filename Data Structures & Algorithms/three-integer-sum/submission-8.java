class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i =0 ; i < nums.length-2 && nums[i] <= 0 ;i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i +1;
            int r = nums.length-1;
            while(l<r) {
                List<Integer> result = new ArrayList<Integer>();
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    resultList.add(List.of(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l < r && nums[r] == nums[r+1]) {
                        r--;
                    }
                }
            }

        }
        return resultList;
    }
}
