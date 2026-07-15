class Solution {
    PriorityQueue<Integer> min;

    public int findKthLargest(int[] nums, int k) {
        min = new  PriorityQueue<Integer>();
        for(int num : nums) {
            add(num, k);
        }
        return min.peek();
    }

    private void add(int val, int k) {
        if(min.size() < k) {
            min.offer(val);
        } else if(min.size() != 0 && val > min.peek()) {
            min.poll();
            min.offer(val);
        }
    }

}
