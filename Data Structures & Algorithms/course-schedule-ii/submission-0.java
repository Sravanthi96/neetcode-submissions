class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i < numCourses;i++) {
            adj.add(new ArrayList<>());
        }
        int m = prerequisites.length;
        for(int i=0; i<m;i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] indegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i< numCourses ; i++) {
            for(int j : adj.get(i)){
                indegree[j]++;
            }
        }

        for(int i=0; i< numCourses;i++) {
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        int[] topo = new int[numCourses];
        int count=0;
        while(!queue.isEmpty()){
            Integer node = queue.poll();
            topo[count++] = node;
            for(Integer n : adj.get(node)){
                indegree[n]--;
                if(indegree[n] == 0){
                    queue.offer(n);
                }
            }
        }

        if(count == numCourses){
            return topo;
        }
        return new int[0];
    }
}
