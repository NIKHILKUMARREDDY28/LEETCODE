class Solution {
    static int helper(int ind, int amt, int[] coins,int[][] dp) {
        if (ind == coins.length ) {
            if (amt != 0) return Integer.MAX_VALUE;
            return 0;
        }
        if(dp[ind][amt] != 0) return dp[ind][amt];
        int not = helper(ind + 1, amt, coins,dp);
        int take = Integer.MAX_VALUE;
        if (coins[ind] <= amt) {
            take = helper(ind, amt - coins[ind], coins,dp);
            take = (take == Integer.MAX_VALUE) ? Integer.MAX_VALUE : take + 1;
        }
        dp[ind][amt] = Math.min(not, take);
        return dp[ind][amt];
    }

    public int coinChange(int[] coins, int amount) {
        if(amount < 1) return 0;
        int[][] dp = new int[coins.length][amount+1];
        int result = helper(0, amount, coins,dp);
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }
}
