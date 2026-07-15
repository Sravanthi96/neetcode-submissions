class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<Integer>();

        for(int num : nums) {
           if(result.contains(num)) {
                return true;
           } else{
                result.add(num);
           }
                
        }
        return false;
    }
}