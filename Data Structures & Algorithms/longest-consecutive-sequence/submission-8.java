class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length == 0) {
        return 0;
       }
       for(int i = 0 ;i < nums.length;i++) {
        for(int j=0;j<nums.length-(i+1);j++) {
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
       }
       int maxLength = 1;
       int currentLength = 1;
       for(int i=0 ; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                continue;
            }
            if(nums[i] + 1 == nums[i+1]) {
                currentLength++;
                System.out.println("currentlength" + currentLength);
            } else {              
                currentLength = 1;
            }
            maxLength = Math.max(maxLength,currentLength);
       }
       return maxLength;
    }
}
