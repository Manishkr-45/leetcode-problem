class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int sr = 0, er = m-1;
        int sc = 0, ec = n-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(sr<=er && sc<= ec){
            for(int j = sc; j<=ec; j++){
                ans.add(mat[sr][j]);

            }
            for(int j = sr+1; j<=er; j++){
                ans.add(mat[j][ec]);

            }
            for(int j = ec-1; j>=sc; j--){
                if(sr == er){
                    break;
                }
                ans.add(mat[er][j]);

            }
            for(int j = er-1; j>sr; j--){
                if(sc == ec){
                    break;
                }
                ans.add(mat[j][sc]);

            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        return ans;
    }
}