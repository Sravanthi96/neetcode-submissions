class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = l+1;
        while( r < prices.length) {
            int diff = 0;
            if(prices[r] > prices[l]){
                diff = prices[r] - prices[l];
            }else {
                l =r;
            }
            maxProfit = Math.max(maxProfit, diff);
            r++;
        }
        return maxProfit;
    }
}
