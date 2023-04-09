class Solution {
    static int helper(int n,int m,String s,String w,int[][] dp){
        if(n < 0) return m+1;
        if(m < 0) return n+1;
        if(dp[n][m] != -1 ) return dp[n][m];
        if(s.charAt(n) == w.charAt(m)){
            dp[n][m] =  helper(n-1,m-1,s,w,dp);
            return dp[n][m];
        }else{
            int rem = 1 + helper(n-1,m,s,w,dp);
            int rep = 1 + helper(n-1,m-1,s,w,dp);
            int rem2 = 1 + helper(n,m-1,s,w,dp);
            dp[n][m] =  Math.min(Math.min(rem,rem2),rep);
            return dp[n][m];
        }
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return helper(n-1,m-1,word1,word2,dp);
    }
}