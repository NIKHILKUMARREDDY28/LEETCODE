class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int rmin = 0, rmax = row -1 ;
        int cmin = 0,cmax = col-1;
        while(rmin <= rmax && cmin <= cmax){
            // Traverse Right 
            for(int i=cmin;i<=cmax;i++){
                ans.add(matrix[rmin][i]);
            }
            rmin++;
            // traverse Down
            for(int i=rmin;i<=rmax;i++){
                ans.add(matrix[i][cmax]);
            }
            cmax--;
            // Traverse Left
            if(rmin<=rmax){
                for(int i=cmax;i>=cmin;i--){
                ans.add(matrix[rmax][i]);
            }
            rmax--;
            }
            // Traverse Up
            if(cmin<=cmax){
                for(int i=rmax;i>=rmin;i--){
                ans.add(matrix[i][cmin]);
            }
            cmin++;
            }
        }
        return ans;
    }
}