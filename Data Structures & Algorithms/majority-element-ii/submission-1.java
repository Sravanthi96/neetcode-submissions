class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0;
        int ele1 = 0;
        int c2 = 0;
        int ele2 = 0;
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i < nums.length;i++) {
            if(c1 == 0 && nums[i] != ele2) {
                c1 = 1;
                ele1 = nums[i];
            } else if(c2 == 0 && nums[i] != ele1) {
                c2 = 1;
                ele2 = nums[i];
            } else if(nums[i] == ele1) {
                c1++;
            }else if(nums[i] == ele2) {
                c2++;
            }else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == ele1) {
                c1++;
            } else if(nums[i] == ele2) {
                c2++;
            }
        }
        if(c1 > nums.length/3) {
            result.add(ele1);
        }
        if(c2 > nums.length/3) {
            result.add(ele2);
        }
        return result;
    }
}