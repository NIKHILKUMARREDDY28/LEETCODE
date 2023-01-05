class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        for(int j=1;j<=rowIndex;j++){
            List<Integer> prev = ans.get(j-1);
            List<Integer> cur = new ArrayList<>();
            for(int i=0;i<=j;i++){
                if(i==0 || i==j) cur.add(1);
                else cur.add(prev.get(i-1) + prev.get(i));
            }
            ans.add(cur);
        }
        return ans.get(rowIndex);
    }
}