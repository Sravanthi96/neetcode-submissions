class NumMatrix {

    int[][] matrix;
    private int[][] prefix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        int rows = matrix.length;
        int cols = matrix[0].length;
        prefix = new int[rows][cols];
        for(int i = 0 ; i < rows;i++) {
            prefix[i][0] = matrix[i][0];
            for(int j= 1 ; j < cols;j++) {
                prefix[i][j] = prefix[i][j-1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result = 0;
        for(int i = row1 ;i <= row2;i++) {
            if(col1 > 0) {
                result = result + prefix[i][col2] - prefix[i][col1-1];
            }else {
                result = result+ prefix[i][col2];
            }
        }
        return result;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */