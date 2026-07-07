class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& mat) {
        vector<int> ans;
        int m = mat.size();
        int n = mat[0].size();
        int srow = 0, scol=0, erow=m-1 , ecol = n-1;
        while(srow<=erow && scol<=ecol ){
            //top
            for(int j = scol; j<=ecol;j++){
                ans.push_back(mat[srow][j]);

            }
            //right
            for(int j = srow+1; j<=erow; j++){
                ans.push_back(mat[j][ecol]);
            }
            //bottom
            for(int i = ecol-1; i>=scol;i--){
                if(srow == erow){
                    break;
                }
                ans.push_back(mat[erow][i]);
            }
            //left
            for(int i =erow-1; i>=srow+1;i-- ){
                if(scol == ecol){
                    break;
                }
                ans.push_back(mat[i][scol]);
                
            }
            srow++; erow--; scol++; ecol--;

        }
        return ans;

        
    }
};