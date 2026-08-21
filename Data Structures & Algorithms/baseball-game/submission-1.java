class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String c : operations){
           if(c.equals("+")){
                int lastScore = stack.pop();
                int sum = lastScore + stack.peek();
                stack.push(lastScore);
                stack.push(sum);
           }else if(c.equals("D")){
                stack.push(stack.peek() * 2);
           }else if(c.equals("C")) {
                stack.pop();
           }else {
                stack.push(Integer.parseInt(c));
           }
        }
        int result = 0;
        while(!stack.isEmpty()){
            result = result + stack.pop();
        }
        return result;
    }
}