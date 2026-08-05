class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m -1;
        int x = nums1.length-1;
        int r = n-1;
        while(r >= 0 && l >= 0) {
            if(nums1[l] > nums2[r]) {
                nums1[x] = nums1[l];
                l--;
            }else {
                nums1[x]= nums2[r];
                r--;
            }
            x--;
        }
        System.out.println("R" + r);
         System.out.println("x" + x); 
        while(r >= 0) {
            nums1[x] = nums2[r];
            x--;
            r--;
        }
    }
}