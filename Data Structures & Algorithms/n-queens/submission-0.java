class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++) {
           Arrays.fill(board[i] , '.');
        }
        solve(0,board,result);
        return result;
    }

    private void solve(int col,char[][] board, List<List<String>> result)      {
        if(col == board.length) {
            List<String> res = new ArrayList<>();
            for(char[] row: board){
                res.add(new String(row));
            }
            result.add(new ArrayList<>(res));
            return;
        }
        for(int row = 0; row < board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                solve(col+1, board, result);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(int row,int col,char[][] board){
        int r = row;
        int c = col;
        while(c >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
           c--;
        }

        r = row;
        c = col;
        while(r >= 0 && c >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c--;
        }

        r = row;
        c = col;
        while(r < board.length && c >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r++;
            c--;
        }
        return true;
    }
}
