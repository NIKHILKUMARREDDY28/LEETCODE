//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

class Pair{
    int nod;
    int par;
    public Pair(int nod,int par){
        this.nod = nod;
        this.par = par;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    private boolean has_cycle(int node,int parent,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node,parent));
        while(!q.isEmpty()){
            int cur = q.peek().nod;
            int pare = q.peek().par;
            q.remove();
            for(Integer it : adj.get(cur)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(new Pair(it,cur));
                }else if(it != pare){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i] == false)if(has_cycle(i,-1,vis,adj)) return true;
        }
        return false;
    }
}