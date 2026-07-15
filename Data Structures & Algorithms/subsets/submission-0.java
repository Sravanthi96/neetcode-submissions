class Solution {
    List<List<Integer>> resultList = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        Arrays.sort(nums);
        subset(0,nums,result);
        return resultList;
    }

    private void subset(int index, int[] nums, List<Integer> result)
    {
        resultList.add(new ArrayList<>(result));
        for(int i=index;i < nums.length;i++) {
            if(i > index && nums[i] == nums[i-1]) 
                continue;
            result.add(nums[i]);
            subset(i+1,nums,result);
            result.remove(result.size()-1);
        }
    }
}
