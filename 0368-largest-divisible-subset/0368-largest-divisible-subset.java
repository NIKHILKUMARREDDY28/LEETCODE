class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        if (n < 2){
            for(int c : nums) ans.add(c);
            return ans;
        }
        int[] com = new int[n];
        com[n-1] = 1;
        int maxi = 1;
        for(int i=n-2;i>=0;i--){
            com[i] = 1;
            for(int j=i+1;j<n;j++){
                if(nums[j] % nums[i] == 0){
                    maxi = Math.max(maxi,1+com[j]);
                    com[i] = Math.max(com[i],1+com[j]);
                }
            }
        }
       
        ans.add(1);
        int cur = 0;
        while(maxi > 0 && cur < n){
            if(com[cur] == maxi && (nums[cur] % ans.get(ans.size()-1)) == 0){
                ans.add(nums[cur]);
                maxi--;
            }
            cur++;
        }
        
        ans.remove(0);
        return ans;
        
    }
}