class Solution {
    private void dfs(int row,int col,boolean[][] vis,int[][] board){
        int n = vis.length;
        int m = vis[0].length;
        
        if(row >= 0 && row < n && col >= 0 && col < m && board[row][col] == 1){
            if(vis[row][col] != true){
                vis[row][col] = true;
                dfs(row+1,col,vis,board);
                dfs(row-1,col,vis,board);
                dfs(row,col+1,vis,board);
                dfs(row,col-1,vis,board);
            }
          
        }
    }
    public int numEnclaves(int[][] board) {
        int n = board.length;
        int m = board[0].length;
       
        boolean canEsc[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            if(board[i][0] == 1)dfs(i,0,canEsc,board);
            if(board[i][m-1] == 1)dfs(i,m-1,canEsc,board);
        }
        for(int i=0;i<m;i++){
            if(board[0][i] == 1)dfs(0,i,canEsc,board);
            if(board[n-1][i] == 1)dfs(n-1,i,canEsc,board);
        }
        int cnt =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(canEsc[i][j] == false && board[i][j] == 1)++cnt;
            }
        }
        return cnt;
    }
}