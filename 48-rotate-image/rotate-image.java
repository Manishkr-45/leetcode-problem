class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                temp[i][n - 1 - j] = matrix[j][i];
            }
        }

        // Copy temp back to matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}