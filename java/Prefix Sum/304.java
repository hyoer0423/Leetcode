class NumMatrix {

    int[][] ma_sum;

    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ma_sum = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                ma_sum[i][j] = ma_sum[i - 1][j] + ma_sum[i][j - 1] - ma_sum[i - 1][j - 1] + matrix[i - 1][j - 1];

            }

        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        return ma_sum[row2 + 1][col2 + 1] - ma_sum[row2 + 1][col1] - ma_sum[row1][col2 + 1] + ma_sum[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */