class Solution {
    private int my_fun(String s, int idx, String p, int idx2, int[][] dp) {
        if (idx2 == p.length()) {
            if (idx == s.length()) return 1;
            return 0;
        }
        if (dp[idx][idx2] != -1) return dp[idx][idx2];
        if (idx == s.length()) {
            if (idx2 < p.length() - 1 && p.charAt(idx2) == '*' && p.charAt(idx2 + 1) == '*') {
                dp[idx][idx2] = my_fun(s, idx, p, idx2 + 1, dp);
            } else if (p.charAt(idx2) == '*') {
                dp[idx][idx2] = my_fun(s, idx, p, idx2 + 1, dp);
            } else {
                dp[idx][idx2] = 0;
            }
            return dp[idx][idx2];
        }
        if (p.charAt(idx2) == '*') {
            dp[idx][idx2] = my_fun(s, idx + 1, p, idx2, dp) | my_fun(s, idx, p, idx2 + 1, dp);
        } else if (p.charAt(idx2) == '?' || p.charAt(idx2) == s.charAt(idx)) {
            dp[idx][idx2] = my_fun(s, idx + 1, p, idx2 + 1, dp);
        } else {
            dp[idx][idx2] = 0;
        }
        return dp[idx][idx2];
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
        return my_fun(s, 0, p, 0, dp) == 1;
    }
}
