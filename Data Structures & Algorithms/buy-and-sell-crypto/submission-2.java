class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int l = 0;
        int r = prices.length -1;
        
        for(int i= 0 ; i < prices.length ;i++) {
            for(int j = i+1 ; j < prices.length ; j++) {
                result = Math.max(result,prices[j]-prices[i]);
               
            }
        }
        return result;
    }
}
