class Solution {
    public void rotate(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i<m; i++){
            for(int j = i+1; j<n; j++){
                swap(mat, i,j);
            }
        }
        for(int i = 0; i<m; i++){
            reverse(mat,i,0,m-1);
        }
        
    }
    public void swap(int mat[][], int i , int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
    public void reverse(int[][] mat, int row, int left, int right) {
        while (left < right) {
            int temp = mat[row][left];
            mat[row][left] = mat[row][right];
            mat[row][right] = temp;

            left++;
            right--;
        }
    }
    
}