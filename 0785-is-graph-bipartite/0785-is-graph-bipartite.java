class Solution {
    private boolean is_bipartite(int node,int[][] graph,int[] color,int col){
        if(color[node] !=0) return color[node] == col;
        color[node] = col;
        for(int i : graph[node]){
            if(!is_bipartite(i,graph,color,-col)) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        int col = -1;
        for(int i=0;i<n;i++){
            if(color[i] == 0){
                if (!is_bipartite(i,graph,color,col)) return false; 
            }
        }
        return true;
        
    }
}