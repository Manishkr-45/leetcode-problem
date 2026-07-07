class Solution {
public:
    bool searchRow(vector<vector<int>>& matrix, int target, int row){
        int n = matrix[0].size();
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(target == matrix[row][mid]){
                return true ;
            }else if (target > matrix[row][mid]){
                s = mid +1;
            }else {
                e = mid -1;
            }
        }
        return false;
    }
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        // BS ON THE ROWS
        int m = matrix.size();
        int n = matrix[0].size();
        int sr = 0;
        int er = m-1;
   
        while(sr<=er){
            int midrow = sr +(er-sr)/2;
            if(target >= matrix[midrow][0] && target<= matrix[midrow][n-1]){
                //found the row
                return searchRow(matrix,target,midrow);

            }
            else if (target >matrix[midrow][n-1]){
                sr = midrow+1;
            }
            else {
                er = midrow-1;
            }

        }
        return false;   
    }
};