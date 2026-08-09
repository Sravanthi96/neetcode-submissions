class Solution {
    public int trap(int[] height) {
        int result = 0;
        int length = height.length;
        int[] prefixMax = new int[length];
        int[] suffixMax = new int[length];
        prefixMax[0] = height[0];
        suffixMax[length-1] = height[length-1];
        for(int i = 1; i< length-1;i++) {
            prefixMax[i] = Math.max(prefixMax[i-1],height[i]);
        }
        for(int i = length-2; i > 0;i--) {
            suffixMax[i] = Math.max(suffixMax[i+1],height[i]);
        }
        for(int i = 1;i < length-1;i++) {
            if(height[i] < prefixMax[i] && height[i] < suffixMax[i]) {
                result += Math.min(prefixMax[i],suffixMax[i]) - height[i];
            }
        }
        return result;
    }
}
