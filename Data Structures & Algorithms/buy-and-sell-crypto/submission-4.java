class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        for(int l =0;l< prices.length-1; l++) {
            for(int r = l+1; r < prices.length;r++) {
                int diff = prices[r] - prices[l];
                if(diff > 0) {
                    profit = Math.max(profit , diff);
                }       
            }
        }
        return profit;
    }
}
