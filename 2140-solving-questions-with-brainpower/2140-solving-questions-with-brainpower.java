class Solution {
    private long helper(int i,int[][] points,HashMap<Integer,Long> ans){
        if(i>=points.length) return 0;
        if(ans.containsKey(i)) return ans.get(i);
        long con = points[i][0] + helper(i+points[i][1]+1,points,ans);
        long not = helper(i+1,points,ans);
        ans.put(i,Math.max(con,not));
        return ans.get(i);
    }
    public long mostPoints(int[][] questions) {
        HashMap<Integer,Long> ans = new HashMap<>();
        return helper(0,questions,ans);
    }
}