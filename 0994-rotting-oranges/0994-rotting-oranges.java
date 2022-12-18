class Pair{
    int x;
    int y;
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int count= 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j));
                    count = -1;
                }
            }
        }
        
        while(!q.isEmpty()){
            count ++;
            int len = q.size();
            for(int i=0;i<len;i++){
                int r = q.peek().x;
                int c = q.peek().y;
                q.remove();
                int[][] trav = {{-1,0},{1,0},{0,-1},{0,1}};
                for(int[] cur : trav){
                    int cr = r + cur[0];
                    int cc = c + cur[1];
                    if(cr >=0 && cr < n && cc >=0 && cc < m && grid[cr][cc] == 1){
                        grid[cr][cc] = 2;
                        q.add(new Pair(cr,cc));
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return count;
    }
}