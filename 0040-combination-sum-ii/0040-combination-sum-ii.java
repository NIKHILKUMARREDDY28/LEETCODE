class Solution {
    static void f(int ind,int[] arr,int tar,List<Integer> q,List<List<Integer>> ans){
    
            if(tar == 0 ){
                ans.add(new ArrayList<>(q));
                return;
            }
                
        
        for(int i = ind;i<arr.length;i++){
            if(i > ind && arr[i-1] == arr[i]) continue;
            if(arr[i] > tar) break;
            //f(i+1,arr,tar,q,ans);
            if(arr[i] <= tar){
            q.add(arr[i]);
            f(i+1,arr,tar-arr[i],q,ans);
            q.remove(q.size()-1);
               
        }
        }
        
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> q = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        f(0,candidates,target,q,ans);
        return ans;
    }
}