class Solution {
    static int helper(int ind, int amt, int[] coins,int[][] dp) {
        if (ind == coins.length ) {
            return (amt == 0) ? 1 : 0;
        }
        if(dp[ind][amt] != -1) return dp[ind][amt];
        int not = helper(ind + 1, amt, coins,dp);
        int take = 0;
        if (coins[ind] <= amt) {
            take = helper(ind, amt - coins[ind], coins,dp);
        }
        dp[ind][amt] = take + not;
        return dp[ind][amt];
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j] = -1;
            }
        }
        int result = helper(0, amount, coins,dp);
        return result;
    }
}