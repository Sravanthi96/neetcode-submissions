class LRUCache {

    private final int capacity;
    private final Map<Integer,Node> cache;
    private final Node head;
    private final Node tail; 

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache =  new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
        
    }
    
    public int get(int key) {
        Node node = cache.get(key);
        if(node == null) {
            return -1;
        }
        moveToFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
         Node existing = cache.get(key);
        if(existing != null){
            existing.value = value;
            moveToFront(existing);
            return;
        }
        Node newNode = new Node(key,value);
        cache.put(key,newNode);
        addToFront(newNode);
        if(cache.size() > capacity) {
            Node lru = removeLast();
            cache.remove(lru.key);
        }
    }
   
    private void addToFront(Node node) {
        Node currentFirst = head.next;

        node.prev = head;
        node.next = currentFirst;
        head.next = node;
        currentFirst.prev = node;
    }

    private Node removeLast() {
        Node last = tail.prev;
        removeNode(last);
        return last;
    }

    private void moveToFront(Node node) {
        removeNode(node);
        addToFront(node);
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

}

public class Node{
    int key;
    int value;
    Node prev;
    Node next;
    public Node(int key,int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}
