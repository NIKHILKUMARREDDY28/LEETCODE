class Solution {
    public List<Integer> getRow(int rowIndex) {
        //List<List<Integer>> ans = new ArrayList<>();
        int[] prev = {1};
        int[] cur;
        List<Integer> ans = new ArrayList<>();
        for(int j=1;j<=rowIndex;j++){
            cur = new int[j+1];
            for(int i=0;i<=j;i++){
                if(i==0 || i==j) cur[i] = 1;
                else cur[i] = prev[i-1] + prev[i];
            }
            prev = cur.clone();
        }
        for(int i:prev) ans.add(i);
        return ans;
    }
}