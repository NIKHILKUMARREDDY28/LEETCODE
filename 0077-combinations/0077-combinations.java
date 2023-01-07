class Solution {
    private void f(int cur,int n,List<Integer> no,List<List<Integer>> ans,int k){
        if(no.size() == k){
            List<Integer> res = new ArrayList<>(no); 
            ans.add(res);
            return;
        }for(int i=cur;i<=n;i++) {
            no.add(i);
            f(i+1,n,no,ans,k);
            no.remove(no.size()-1);
        }
        
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> no = new ArrayList<>();
        f(1,n,no,ans,k);
        return ans;
    }
}