class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>>  result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        if(strs.length == 1) {
            result.add(List.of(strs[0]));
            return result;
        }
        for(int i=0; i < strs.length ; i++) {
            if (visited[i]) continue;
            List<String>  res = new ArrayList<String>();
            res.add(strs[i]);
            visited[i] = true;
             
            for(int j= i+1; j < strs.length; j++) {
                if(!visited[j] && frequency(strs[i],strs[j])){
                    res.add(strs[j]);
                    visited[j] = true;
                }
            }
            if(!res.isEmpty())
            result.add(res);
        }
        return result;
    }

    private boolean frequency (String s , String t) {
        if (s.length() != t.length()) return false;
        int[] freq  = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : t.toCharArray()){
            freq[c -'a']--;
        }
        for(int count : freq) {
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
