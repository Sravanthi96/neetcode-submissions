class Solution {
    public int countSeniors(String[] details) {
        int result = 0;
        for(int i =0 ; i < details.length;i++){
            String str = details[i].substring(11,13);
            System.out.println(str);
            int age = Integer.parseInt(str);
            if(age > 60) {
                result++;
            }
        }
        return result;
    }
}