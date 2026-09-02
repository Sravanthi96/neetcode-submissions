class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i =0 ; i < piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        return minSpeed(piles,max,h);
    }

    private int minSpeed(int[] piles, int max, int hours){
        int low = 1;
        int high = max;
        int ans = 0;
        while(low <= high) {
            int mid = (low +high)/2;
            int totalhrs = totalHrs(piles,mid);
            if(totalhrs <= hours){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    private int totalHrs(int[] piles, int hour) {
        int total = 0;
        for(int i = 0;i< piles.length;i++) {
            total += Math.ceil((double) piles[i]/hour);
        }
        return total;
    }
}