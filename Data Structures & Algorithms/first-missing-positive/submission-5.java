class Solution {
    public int firstMissingPositive(int[] nums) {
        List<Integer>  list = new ArrayList<Integer>();
        for(int num : nums) {
            list.add(num);
        }
        int x = 0;
        for(int i = 1 ; i <= nums.length;i++) {
            if(list.contains(i)){
                continue;
            }else {
                x = i;
                break;
            }
        }
        if(x == 0) {
            return nums.length + 1;
        }
        return x;
    }
}