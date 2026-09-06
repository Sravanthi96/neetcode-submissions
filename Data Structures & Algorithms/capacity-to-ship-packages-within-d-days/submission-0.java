class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        int result = 0;
        for(int weight : weights) {
            low = Math.max(low,weight);
            high = high + weight;
        }

        while(low <= high) {
            int mid = (low+high)/2;
            int totalDays = totalNoOfDays(weights,mid);
            if(totalDays <= days) {
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }

    private int totalNoOfDays(int[] weights,int totalWeight) {
        int days = 1;
        int currentWeight = 0;
        for(int weight : weights) {
            if(currentWeight + weight > totalWeight) {
                days++;
                currentWeight = 0;
            }
            currentWeight = currentWeight + weight;
        }
        return days;
    }
}