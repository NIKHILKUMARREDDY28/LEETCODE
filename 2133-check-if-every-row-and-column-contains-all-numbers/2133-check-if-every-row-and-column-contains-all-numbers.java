class Solution { 
    private boolean check_row(int row,int[][] matrix){
        HashSet<Integer> q = new HashSet<>();
        int n = matrix.length;
        for(int i=0;i<n;i++){
            if(q.contains(matrix[row][i])){
                return false;
            }else q.add(matrix[row][i]);
        }
        return true;
        
    }
    private boolean check_col(int col,int[][] matrix){
        HashSet<Integer> q = new HashSet<>();
        int n = matrix.length;
        for(int i=0;i<n;i++){
            if(q.contains(matrix[i][col])){
                return false;
            }else q.add(matrix[i][col]);
        }
        return true;
        
    }
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            if(!check_row(i,matrix) || !check_col(i,matrix) ) return false;
        }
        return true;
    }
}