class Solution {
    private int helper(int ind, int mat, String s, String p, int[][] dp) {
        if (mat == p.length()){
            if (ind == s.length()) return 1;
            return 0;
        }
        if (ind > s.length() || mat > p.length()) return 0;
        if (dp[ind][mat] != -1) return dp[ind][mat];
        else {
            if (mat == p.length()) {
                return (ind == s.length()) ? 1 : 0;
            }
            boolean f_w = ind < s.length()
                    && (s.charAt(ind) == p.charAt(mat) || p.charAt(mat) == '.');
            int first = (f_w) ? 1 : 0;
            if (mat + 1 < p.length() && p.charAt(mat + 1) == '*') {
                int no = helper(ind, mat + 2, s, p, dp);
                int yes = helper(ind + 1, mat, s, p, dp);
                dp[ind][mat] = no | (first & yes);
                return dp[ind][mat];
            } else {
                dp[ind][mat] = first & helper(ind + 1, mat + 1, s, p, dp);
                return dp[ind][mat];
            }

        }
    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = helper(0, 0, s, p, dp);
        return ans == 1;
    }
}
