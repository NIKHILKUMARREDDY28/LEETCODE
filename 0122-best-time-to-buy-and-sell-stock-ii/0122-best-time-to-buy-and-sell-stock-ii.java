class Solution {
    private int helper(int i,int has,int[] prices,int[][] dp){
        if(i==prices.length) return 0;
        if(dp[i][has] != -1) return dp[i][has];
        if(has == 1){
            int sell = prices[i] + helper(i,0,prices,dp);
            int not = helper(i+1,1,prices,dp);
            dp[i][has] = Math.max(sell,not);
            return dp[i][has];
        }else{
            int buy = -prices[i] + helper(i+1,1,prices,dp);
            int not = helper(i+1,0,prices,dp);
            dp[i][has] = Math.max(buy,not);
            return dp[i][has];
        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j] = -1;
            }
        }
        return helper(0,0,prices,dp);
    }
}