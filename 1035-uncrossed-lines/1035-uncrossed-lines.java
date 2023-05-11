class Solution {
    private int helper(int n,int m,int[] arr1,int[] arr2,int[][] dp){
        if(n < 0 || m < 0) return 0;
        if(dp[n][m] != -1 ) return dp[n][m];
        if(arr1[n] == arr2[m]) return 1 + helper(n-1,m-1,arr1,arr2,dp);
        int top = helper(n-1,m,arr1,arr2,dp);
        int down = helper(n,m-1,arr1,arr2,dp);
        dp[n][m] = Math.max(top,down);
        return dp[n][m];
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return helper(n-1,m-1,nums1,nums2,dp);
    }
}