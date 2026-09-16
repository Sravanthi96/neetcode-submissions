class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        getPermute(nums,freq,result,resultList);
        return resultList;
    }

    private void getPermute(int[] nums,boolean[] freq,List<Integer> result,
        List<List<Integer>> resultList){
            if(result.size() == nums.length) {
                resultList.add(new ArrayList<>(result));
                return;
            }
            for(int i = 0;i < nums.length;i++){
                if(!freq[i]){
                    freq[i] = true;
                    result.add(nums[i]);
                    getPermute(nums,freq,result,resultList);
                    result.remove(result.size() - 1);
                    freq[i] = false;
                }
            }
    }
}
