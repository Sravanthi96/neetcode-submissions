class MinStack {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp = new Stack<Integer>();
        int x = stack.peek();
        while(!stack.isEmpty()) {
            x = Math.min(x,stack.peek());
            temp.push(stack.pop());
        }
         while(!temp.isEmpty()) {
            stack.push(temp.pop());
         }
        return x;
    }
}
