class Solution {
    private int my_fun(int[] cost,int idx,int[] dp){
        if(idx > cost.length - 1 ) return 0;
        if(dp[idx] != -1) return dp[idx];
        else{
            int one = cost[idx] + my_fun(cost,idx+1,dp);
        
            int two = cost[idx] + my_fun(cost,idx+2,dp);
            dp[idx] = Math.min(one,two);
            return dp[idx];
        }
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i] = -1;
        }
        return Math.min(my_fun(cost,0,dp),my_fun(cost,1,dp));
    }
}