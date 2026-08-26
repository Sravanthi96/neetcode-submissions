class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>  adj = new ArrayList<>();
        for(int i =0; i<numCourses;i++) {
            adj.add(new ArrayList<>());
        }
        int m = prerequisites.length;
        for(int i =0; i <m;i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] indegree = new int[numCourses];
        for(int i= 0; i<numCourses;i++){
            for(Integer j : adj.get(i)){
                indegree[j]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] topo= {0};
        for(int i=0;i<numCourses;i++) {
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        int count = 0;
        while(!queue.isEmpty()){
            Integer node = queue.poll();
            count++;
            for(Integer i : adj.get(node)){
                indegree[i]--;
                if(indegree[i] == 0) {
                    queue.offer(i);
                }
            }
        }

        if(count == numCourses) {
            return true;
        }
        return false;
    }
}
