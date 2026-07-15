class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums); 
        backtrack(0, nums, new ArrayList<>());
        return result;
    }

     private void backtrack(int start, int[] nums, List<Integer> temp) {
        System.out.println("Called backtrack");
        result.add(new ArrayList<>(temp));  // add every subset
        result.stream().forEach(x->System.out.println("result: " + x));
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            backtrack(i + 1, nums, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
