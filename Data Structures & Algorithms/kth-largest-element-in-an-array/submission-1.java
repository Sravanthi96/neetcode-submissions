class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] heap = new int[k];
        int size = 0;
        for(int num : nums) {
            if(size < k) {
                heap[size] = num;
                int index = size;
                size++;
                while(index > 0 && heap[(index-1)/2] > heap[index]) {
                    int temp = heap[index];
                    heap[index] = heap[(index-1)/2];
                    heap[(index-1)/2] = temp;
                    index = (index-1)/2;
                } 
            }else if(num >= heap[0]){
                heap[0] =num;
                heapify(0,k,heap);
            }
        }
        return heap[0];
    }

    private void heapify(int index,int k, int[] heap){
        while(true) {
            int left_child = 2*index +1;
            int right_child = 2*index +2;
            int smallest = index;
            if(left_child < k && heap[left_child] < heap[smallest]) {
                smallest = left_child;
            }
            if(right_child < k && heap[right_child] < heap[smallest]) {
                smallest = right_child;
            }
            if(smallest != index) {
                int temp = heap[smallest];
                heap[smallest] = heap[index];
                heap[index] = temp;
                index = smallest;
            }else {
                break;
            }
        }
    }
}
