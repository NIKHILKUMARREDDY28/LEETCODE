class Solution {
    static int helper(int ind,int sum,int tar,int[] nums,int[][] dp){
        if(ind == nums.length) return (sum == tar) ? 1 : 0;
        if(dp[ind][sum] != -1) return dp[ind][sum];
        int take = 0;
        if(sum+nums[ind] <= tar) take = helper(ind+1,sum+nums[ind],tar,nums,dp);
        int not = helper(ind+1,sum,tar,nums,dp);
        dp[ind][sum] = take | not;
        return dp[ind][sum];
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums) sum += i;
        if(sum % 2 != 0) return false;
        int[][] dp = new int[nums.length][sum + 1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j] = -1;
            }
        }
        return (helper(0,0,sum/2,nums,dp)==1) ? true : false;
    }
}