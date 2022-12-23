class Pair{
    int x;
    int y;
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    q.add(new Pair(i,j));
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = -1;
                }
            }
        }
        
        int dist = 0;
        while(!q.isEmpty()){
            ++ dist;
            int size = q.size();
            for(int i=0;i<size;i++){
                int row = q.peek().x;
                int col = q.peek().y;
                q.remove();
                int[][] trav = {{0,-1},{0,1},{-1,0},{1,0}};
                for(int[] cur:trav){
                    int r = row + cur[0];
                    int c = col + cur[1];
                    if(r >= 0 && r < m && c >= 0 && c < n && ans[r][c] == -1) {
                        ans[r][c] = dist;
                        q.add(new Pair(r,c));
                    }
                }
            }
        }
        return ans;
    }
}
