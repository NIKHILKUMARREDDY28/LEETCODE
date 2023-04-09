class Solution {
    static int helper(int n,int m,int x,int y,int[][] dp){
        if(n==x-1 && m == y-1) return 1;
        if(n < x && m < y){
            if(dp[n][m] != -1) return dp[n][m];
            int left = helper(n,m+1,x,y,dp);
            int right = helper(n+1,m,x,y,dp);
            dp[n][m] =  left + right;
            return dp[n][m];
        }return 0;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }
        return helper(0,0,m,n,dp);
    }
}