class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for(String c : operations) {
            if(c.equals("+")){
                int lastScore = stack.pop();
                int sum = lastScore + stack.peek();
                result = result + sum;
                stack.push(lastScore);
                stack.push(sum);
            } else if(c.equals("D")){
                stack.push(stack.peek() * 2);
                result = result + (stack.peek());
            }else if(c.equals("C")){
                result = result - (stack.pop());
            }else {
                stack.push(Integer.parseInt(c));
                result = result + stack.peek();
            }
        }
        return result;
    }
}