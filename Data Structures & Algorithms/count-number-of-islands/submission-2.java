class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];

        for(int i =0;i < n;i++) {
            for(int j=0; j < m;j++) {
                if(visited[i][j] == 0 && grid[i][j] == '1'){
                    bfs(i,j,visited,grid);
                    result++;
                }
            }
        }
        return result;
    }

    private void bfs(int ro,int co,int[][] visited, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        visited[ro][co] = 1;
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(ro,co));

        int[] rowD = {-1,0,1,0};
        int[] colD = {0,1,0,-1};

        while(!queue.isEmpty()) {
            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.remove();
            for(int d=0; d<4;d++) {
                int nrow = row + rowD[d];
                int ncol = col + colD[d];
                if(nrow >= 0 && nrow <n && ncol >=0 && ncol < m &&
                 visited[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                    visited[nrow][ncol] = 1;
                    queue.add(new Pair(nrow,ncol));
                 }
            }
        }
    }
}

class Pair {
    int first;
    int second;
    public Pair(int first,int second) {
        this.first = first;
        this.second = second;
    }
}