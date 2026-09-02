class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i< piles.length;i++) {
            max = Math.max(max,piles[i]);
        }
        return binary(piles,max,h);
    }

    private int binary(int[] piles, int max, int hour){
        int low = 1;
        int high = max;
        int ans = 0;
        while(low <= high) {
            int mid = (low+high)/2;
            int totalhrs = calculateHrs(piles,mid);
            if(totalhrs <= hour) {
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    private int calculateHrs(int[] piles, int hour){
        int totalhrs = 0;
        for(int i = 0; i< piles.length;i++) {
            totalhrs += Math.ceil((double) piles[i]/hour);
        }
        return totalhrs;
    }
}
