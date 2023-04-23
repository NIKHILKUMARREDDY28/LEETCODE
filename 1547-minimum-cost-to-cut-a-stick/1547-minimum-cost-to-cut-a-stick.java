class Solution {
    private int helper(int i,int j,int[] cuts,int[][] dp){
        if(i>j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int take = cuts[j+1] - cuts[i-1] + helper(i,k-1,cuts,dp) + helper(k+1,j,cuts,dp);
            ans = Math.min(ans,take);
        }
        dp[i][j] = ans;
        return dp[i][j];
    }
    public int minCost(int n, int[] cuts) {
        int k = cuts.length;
        int[] cut = new int[k+2];
        cut[0] = 0;
        for(int i=1;i<k+1;i++) cut[i] = cuts[i-1];
        cut[k+1] = n;
        Arrays.sort(cut);
        int[][] dp = new int[k+1][k+1];
        for(int i=0;i<k+1;i++){
            for(int j=0;j<k+1;j++) dp[i][j] = -1;
        }
        return helper(1,k,cut,dp);
        
        
    }
}