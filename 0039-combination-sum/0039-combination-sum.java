class Solution {
    static void f(int ind,int[] arr,int tar,List<Integer> q,List<List<Integer>> ans){
        if(ind == arr.length){
            if(tar == 0)ans.add(new ArrayList<>(q));
            return;
        }
        f(ind+1,arr,tar,q,ans);
        if(arr[ind] <= tar){
            q.add(arr[ind]);
            f(ind,arr,tar-arr[ind],q,ans);
            q.remove(q.size()-1);
               
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> q = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        f(0,candidates,target,q,ans);
        return ans;
    }
}