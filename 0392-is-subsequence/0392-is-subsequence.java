class Solution {
    private int my_fun(String s1,int idx1,String s2,int idx2,int[][] dp){
        if(idx2 >= s2.length()){
            if(idx1 >= s1.length()) return 1;
            return 0;
        }
        if(idx1 >= s1.length()) return 1;
        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];
        if(s1.charAt(idx1) == s2.charAt(idx2)){
            dp[idx1][idx2] = my_fun(s1,idx1 +1 , s2,idx2+1,dp);
        }else{
            dp[idx1][idx2] = my_fun(s1,idx1, s2,idx2+1,dp);
        }
        return dp[idx1][idx2];
    }
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    dp[i][j] = -1;
                }
            }
        return my_fun(s,0,t,0,dp) == 1;
    }
}