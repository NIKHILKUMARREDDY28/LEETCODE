class Solution {
    private int helper(int[] nums, int pos,int[] dp) {
        if(pos >= nums.length - 1) return 0; 
        if (dp[pos] != -1) return dp[pos];
	int minJumps = 10001;  // initialising to max possible jumps + 1
	for(int j = 1; j <= nums[pos]; j++)  // explore all possible jump sizes from current position
		minJumps = Math.min(minJumps, 1 + helper(nums, pos + j,dp));        
	dp[pos] = minJumps;
        return dp[pos];
    }

    public int jump(int[] nums) {
        int[] dp = new int[nums.length+1];
        for (int i=0;i<= nums.length;i++) dp[i] = -1;
        return helper(nums, 0,dp);
    }
}
