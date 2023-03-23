class Solution {
    static boolean isSafe(int i,int j,char[][] arr,int n){
        int row = i;
        int col = j;
        while(i >=0 && j >= 0){
            if(arr[i][j] == 'Q') return false;
            i--;
            j--;
        }
        i= row;
        j= col;
        while(j >=0){
            if(arr[i][j] == 'Q') return false;
            j--;
        }
        i= row;
        j= col;
        while (i<n && j >= 0){
            if(arr[i][j] == 'Q') return false;
            i++;
            j--;
        }
        return true;
    }
    static  void helper(int col,char[][] arr,List<List<String>> ans,int n){
        if(col == n){
            List<String> res = new ArrayList<>();
            for(int i=0;i<n;i++){
                res.add(String.valueOf(arr[i]));
            }
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int row = 0;row < n;row++){
            if(isSafe(row,col,arr,n)){
                arr[row][col] = 'Q';
                helper(col+1,arr,ans,n);
                arr[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        helper(0,arr,ans,n);
        return ans;
    }
}