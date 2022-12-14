class Solution {
    private void dfs(int node,int[][] M,int[] vis){
        for(int j=0;j<M.length;j++){
            if(M[node][j] == 1 && vis[j] == 0){
                vis[j] = 1;
                dfs(j,M,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int m = isConnected.length;
        int[] vis = new int[m];
        int count = 0;
        for(int i=0;i<m;i++){
            if(vis[i] == 0){
                dfs(i,isConnected,vis);
                count ++;
            }
            
        }
        return count;
        
    }
}