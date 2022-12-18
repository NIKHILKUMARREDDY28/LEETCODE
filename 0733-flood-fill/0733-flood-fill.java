class Poin{
    int x;
    int y;
    public Poin(int x,int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int initc = image[sr][sc];
        boolean vis[][] = new boolean[n][m];
        Queue<Poin> q = new LinkedList<>();
        vis[sr][sc] =  true;
        image[sr][sc] = color;
        q.add(new Poin(sr,sc));
        while(!q.isEmpty()){
            int r = q.peek().x;
            int c = q.peek().y;
            q.remove();
            int[][] trav = {{0,-1},{-1,0},{0,1},{1,0}};
            for(int[] cur : trav){
                int curx = r + cur[0];
                int cury = c + cur[1];
                if(curx >=0 && curx < n && cury >=0 && cury < m && image[curx][cury] == initc&&vis[curx][cury]==false){
                    image[curx][cury] = color;
                    vis[curx][cury] = true;
                    q.add(new Poin(curx,cury));
                }
            }
        }
        return image;
    }
}