class Solution {
public:
    bool isSafe(vector<vector<char>>& board, int row, int col, int digit){
        for(int i = 0; i<9; i++){
            if(board[row][i] == digit){
                return false;
            }
        }
        for(int j = 0; j<9; j++){
            if(board[j][col] == digit){
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr;i<=sr+2; i++){
            for(int j = sc; j<=sc+2; j++){
                if(board[i][j] == digit){
                    return false;
                }

            }
           
        }
        return true;
    }



    bool solver(vector<vector<char>>& board, int row, int col){
        if(row == 9){
            
            return true;
        }
        int nextrow = row, nextcol = col+1;
        if(nextcol == 9){
            nextrow = row+1;
            nextcol = 0;
        }
        if(board[row][col] != '.'){
            return solver(board,nextrow,nextcol);
        }
        for(char digit = '1'; digit<='9'; digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col] = digit;
                if(solver(board,nextrow,nextcol)){
                  return true;  
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    void solveSudoku(vector<vector<char>>& board) {
        solver(board,0,0);
        
    }
};