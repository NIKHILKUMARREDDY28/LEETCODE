class Solution {
    private void dfs(int row,int col,boolean[][] vis,char[][] board){
        int n = vis.length;
        int m = vis[0].length;
        
        if(row >= 0 && row < n && col >= 0 && col < m && board[row][col] == 'O'){
            if(vis[row][col] != true){
                vis[row][col] = true;
                dfs(row+1,col,vis,board);
                dfs(row-1,col,vis,board);
                dfs(row,col+1,vis,board);
                dfs(row,col-1,vis,board);
            }
          
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
       
        boolean canEsc[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O')dfs(i,0,canEsc,board);
            if(board[i][m-1] == 'O')dfs(i,m-1,canEsc,board);
        }
        for(int i=0;i<m;i++){
            if(board[0][i] == 'O')dfs(0,i,canEsc,board);
            if(board[n-1][i] == 'O')dfs(n-1,i,canEsc,board);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(canEsc[i][j] == false && board[i][j] == 'O')board[i][j]='X';
            }
        }
        
    }
}