class Solution {
    List<List<Integer>> resultList = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        resultList.add(new ArrayList<>(result));
        subset(0,nums,result);
        return resultList;
    }

    private void subset(int index, int[] nums, List<Integer> result)
    {
        if(index == nums.length) {
            if(result.size() > 0) {
                resultList.add(new ArrayList<>(result));
            }
            return;
        }
        result.add(nums[index]);
        subset(index+1,nums,result);
        result.remove(result.size()-1);
        subset(index+1,nums,result);
        
    }
}
