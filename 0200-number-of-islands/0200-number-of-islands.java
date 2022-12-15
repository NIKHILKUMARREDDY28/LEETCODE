class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    
    private void f(int row,int col,char[][] mat,boolean[][] visi){
        visi[row][col] = true;
        int n = mat.length;
        int m = mat[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            int cr = q.peek().first;
            int cc = q.peek().second;
            q.remove();
            int[][] trav = {{-1,0},{0,-1},{1,0},{0,1}};
            for(int[] arr : trav){
                
                    int r = cr + arr[0];
                    int c = cc + arr[1];
                    if(r>=0 && r<n && c>=0 && c<m && visi[r][c] == false && mat[r][c] == '1' ){
                        visi[r][c] = true;
                        q.add(new Pair(r,c));
                    }
                
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] == false && grid[i][j] == '1'){
                    count ++;
                    f(i,j,grid,vis);
                }
            }
        }
        return count;
    }
}