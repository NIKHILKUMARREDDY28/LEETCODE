class Solution {
    private int f(int i,int j,String s,String p,int[][] dp){
        if(j >= p.length()) return  i>=s.length() ? 1 : 0;
        else if(i>= s.length()){
            for(int c = j ;c <p.length();c++){
                if(p.charAt(c) != '*') return 0;
            }
            return 1;
        }
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            dp[i][j] = f(i+1,j+1,s,p,dp);
            return dp[i][j];
        }else if(p.charAt(j) == '*'){
            dp[i][j] = f(i,j+1,s,p,dp) | f(i+1,j,s,p,dp);
            return dp[i][j];
        }
        return 0;
    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j] = -1;
            }
        }
        return f(0,0,s,p,dp) == 1;
    }
}