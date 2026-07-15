class KthLargest {

    int[] heap;
    int size;
    int k;

    public KthLargest(int k, int[] nums) {
        this.size = 0;
        this.k = k;
        heap = new int[k];
        for(int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
         if(size < k) {
            heap[size] = val;
            int index = size;
            size++;
            while(index > 0 && heap[(index-1)/2] > heap[index]) {
                int temp = heap[index];
                heap[index] = heap[(index-1)/2];
                heap[(index-1)/2] = temp;
                index = (index-1) /2;
            }
         }else if(val >= heap[0]) {
             heap[0] = val;
             heapify(0);
         }
         return heap[0];
    }

    private void heapify(int index) {
         while(true) {
            int left_child = 2*index + 1;
            int right_child = 2*index + 2;
            int smallest = index;

            if(left_child < size && heap[left_child] < heap[smallest]) {
                smallest = left_child;
            }
            if(right_child < size && heap[right_child] < heap[smallest]) {
                smallest = right_child;
            }
            if(smallest != index) {
                int temp = heap[index];
                heap[index] = heap[smallest];
                heap[smallest] = temp;
                index = smallest;
            } else {
                break;
            }
         }
    }
}
