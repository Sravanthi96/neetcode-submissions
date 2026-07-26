class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int result = 0;
        for(int r = 1; r < prices.length;r++) {
            int diff = 0;
            if(prices[l] < prices[r]){
                diff = prices[r] - prices[l];
                l++;
            }else {
                l = r;
            }
            result = result + diff;
        }
        return result;
    }
}