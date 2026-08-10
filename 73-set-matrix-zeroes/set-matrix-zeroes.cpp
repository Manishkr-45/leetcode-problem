class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {

        int m = matrix.size();
        int n = matrix[0].size();
        bool isRow = false;
        bool isCol = false;
        // check first row
        for(int j = 0; j<n; j++){
            if(matrix[0][j] == 0){
                isRow = true;
            }
        }
        // check for the col
        for(int i = 0; i<m; i++){
            if(matrix[i][0] == 0){
                isCol = true;
            }
        }
        // set the markers
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //set to  row zeros
        for(int i = 1; i<m; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j<n; j++){
                    matrix[i][j]=0;
                }

            }
        }
        // set to col zeros
        for(int j = 1; j<n; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i<m; i++){
                    matrix[i][j]=0;
                }

            }
        }
        if(isRow){
            for(int j = 0; j<n; j++){
                matrix[0][j]=0;
            }
        }
        if(isCol){
            for(int i = 0; i<m; i++){
                matrix[i][0]= 0;
            }
        }
    }
};