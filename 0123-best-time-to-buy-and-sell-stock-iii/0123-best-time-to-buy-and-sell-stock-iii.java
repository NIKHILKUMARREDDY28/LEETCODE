class Solution {
    private int helper(int i,int has,int cnt ,int[] prices,int[][][] dp){
        if(i==prices.length) return 0;
        if(dp[i][cnt][has] != -1) return dp[i][cnt][has];
        if(cnt > 0){
            if(has==1){
                int sell = prices[i] + helper(i+1,0,cnt,prices,dp);
                int not = helper(i+1,1,cnt,prices,dp);
                dp[i][cnt][has] = Math.max(sell,not);
                return dp[i][cnt][has];
            }else{
                int buy = -prices[i] + helper(i+1,1,cnt-1,prices,dp);
                int not = helper(i+1,0,cnt,prices,dp);
                dp[i][cnt][has] = Math.max(buy,not);
                return dp[i][cnt][has];
            }
        }else{
            if(has==1){
                int sell = prices[i] + helper(i+1,0,cnt,prices,dp);
                int not = helper(i+1,1,cnt,prices,dp);
                dp[i][cnt][has] = Math.max(sell,not);
                return dp[i][cnt][has];
            }else{
                dp[i][cnt][has] = helper(i+1,0,cnt,prices,dp);
                return dp[i][cnt][has];
            }
        }
        
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp= new int[n][3][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++)dp[i][j][k] = -1;
            }
        }
        return helper(0,0,2,prices,dp);
    }
}