//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    private void dfs(int row,int col,boolean[][] vis,int[][] grid,List<String> cur,int row0,int col0){
        vis[row][col] = true;
        cur.add(toStr(row-row0,col-col0));
        int n = grid.length;
        int m = grid[0].length;
        int[] trav_row = {-1,0,1,0};
        int[] trav_col = {0,-1,0,1};
        for(int i=0;i<4;i++){
            int r = row + trav_row[i];
            int c = col + trav_col[i];
            if (r >= 0 && r < n && c >= 0 && c < m && vis[r][c] == false && grid[r][c] == 1){
                dfs(r,c,vis,grid,cur,row0,col0);
            }
        }
    }
    private String toStr(int a,int b){
        return Integer.toString(a) + " " + Integer.toString(b);
    }

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int n = grid.length;
        int m = grid[0].length;
        HashSet<List<String>> ans = new HashSet<>();
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1 && vis[i][j] == false){
                    List<String> cur = new ArrayList<>();
                    dfs(i,j,vis,grid,cur,i,j);
                    ans.add(cur);
                }
            }
        }
        return ans.size();
    }
}
