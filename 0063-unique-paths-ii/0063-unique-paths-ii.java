class Solution {
    static int helper(int i, int j , int[][] grid,int[][] dp){
        if(i == grid.length-1 && j == grid[0].length-1 ){
            return (grid[i][j] == 0) ? 1 : 0;
        }
        if(i < grid.length && j < grid[0].length){
            if(dp[i][j] != -1) return dp[i][j];
            if(grid[i][j] == 0){
                int right = helper(i,j+1,grid,dp);
                int down  = helper(i+1,j,grid,dp);
                dp[i][j] =  right + down ;
                return dp[i][j];
            }
        }
        return 0;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return helper(0,0,obstacleGrid,dp);
    }
}