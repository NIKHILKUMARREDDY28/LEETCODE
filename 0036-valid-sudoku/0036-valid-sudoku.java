class Solution {
    private boolean is_valid(int i,int j,char[][] board){
        //row check
        for(int t=0;t<9;t++){
            if(t!=j && board[i][t] == board[i][j]) return false;
        }
        for(int t=0;t<9;t++){
            if(t!=i && board[t][j] == board[i][j]) return false;
        }
        for(int t=0;t<9;t++){
            int r = 3*(i/3) + t/3;
            int c = 3*(j/3)+ t%3;
            if( r != i && c != j && board[r][c] == board[i][j]) return false;
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(!is_valid(i,j,board)) return false;
                }
            }
        }
        return true;
    }
}