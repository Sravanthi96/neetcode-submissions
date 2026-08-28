class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<String>();
        for(String str : wordList){
            set.add(str);
        }
        if(set.contains(beginWord)){
            set.remove(beginWord);
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(beginWord,1));
        while(!queue.isEmpty()) {
            String word = queue.peek().first;
            int steps = queue.peek().second;
            if(word.equals(endWord)){
                return steps;
            }
            queue.poll();
            char[] wordArray = word.toCharArray();
            for(int i =0;i<word.length();i++){
                char original = wordArray[i];
                for(char ch = 'a';ch <= 'z';ch++) {
                    wordArray[i] = ch;
                    String replaceWord = new String(wordArray);
                    if(set.contains(replaceWord)){
                        set.remove(replaceWord);
                        queue.offer(new Pair(replaceWord,steps+1));
                    }
                }
                wordArray[i] = original;
            }
        }
        return 0;
    }
}
class Pair{
    String first;
    int second;
    public Pair(String first, int second) {
        this.first = first;
        this.second = second;
    }
}

