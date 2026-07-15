class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char c : s.toCharArray()) {
           if(map.containsKey(c)){
                if(!st.isEmpty() && st.peek() == map.get(c)) {
                    st.pop();
                }else{
                    return false;
                }
           }else{
                 st.push(c);
           }
        }
        return st.isEmpty();
    }
}
