class MyHashSet {

    private List<Integer> hashset;

    public MyHashSet() {
        hashset = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!hashset.contains(key)) {
            hashset.add(key);
        }
    }
    
    public void remove(int key) {
        hashset.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return hashset.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */