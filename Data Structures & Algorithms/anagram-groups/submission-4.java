class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        Map<Integer,String> exists = new HashMap<Integer,String>();
        for(int i =0 ; i < strs.length;i++) {
            List<String> resultList = new ArrayList<String>();
            if(exists.containsKey(i)){
               continue;
            }
            resultList.add(strs[i]);
            exists.put(i,strs[i]);
            for(int j= i+1; j < strs.length;j++) {
                if(!exists.containsKey(j) && isMatch(strs[i], strs[j])){
                    resultList.add(strs[j]);
                    exists.put(j,strs[j]);
                }
            }
            if(!resultList.isEmpty())
                result.add(resultList);
        }
        return result;
    }

    private boolean isMatch(String s , String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c-'a']++;
        }
        for(char c : t.toCharArray()) {
            freq[c-'a']--;
        }
        for(int count : freq) {
            if(count>0) {
                return false;
            }
        }
        return true;
    }
}
