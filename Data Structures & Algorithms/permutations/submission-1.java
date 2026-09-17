class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        perm(0,nums,resultList);
        return resultList;
    }

    private void perm(int index , int[] nums, List<List<Integer>> resultList){
        if(index == nums.length) {
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i< nums.length;i++) {
                res.add(nums[i]);
            }
            resultList.add(new ArrayList<>(res));
            return;
        }
        for(int i = index;i < nums.length;i++) {
            swap(i,index,nums);
            perm(index + 1,nums,resultList);
            swap(i,index,nums);
        }
    }

    private void swap(int i, int index,int[] nums) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
