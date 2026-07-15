class Solution {
    PriorityQueue<Integer>  heap;
    public int lastStoneWeight(int[] stones) {
        heap = new PriorityQueue<Integer>();
        for(int stone : stones) {
            heap.offer(-stone);
        }
        while(heap.size() > 1) {
            int first = heap.poll();
            int second = heap.poll();
            if(second > first) {
                heap.offer(first-second);
            } 
        }
        heap.offer(0);
        return Math.abs(heap.peek());
    }
}
