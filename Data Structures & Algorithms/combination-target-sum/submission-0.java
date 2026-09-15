class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findComb(0,nums,target,result,new ArrayList<>());
        return result;
    }

    private void findComb(int index, int[] nums, int target,List<List<Integer>> result, List<Integer> res){
        if(index == nums.length){
            if(target == 0) {
                result.add(new ArrayList<>(res));
            }
            return;
        }
        if(nums[index] <= target) {
            res.add(nums[index]);
            findComb(index,nums,target-nums[index],result,res);
            res.remove(res.size() - 1);
        }
        findComb(index+1,nums,target,result,res);
    }
    
}
