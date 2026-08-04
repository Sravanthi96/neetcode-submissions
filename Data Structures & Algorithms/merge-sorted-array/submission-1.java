class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = Math.abs(nums1.length - nums2.length);
        for(int i = length, j = 0; j < nums2.length; i++,j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}