class Solution {
    
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) ans[i] =1;
        for(int i=n-2;i>=0;i--){
            int cur = nums[i];
            for(int j=i+1;j<n;j++){
                if(cur < nums[j]){
                    ans[i] = Math.max(ans[i],1 + ans[j]);
                }
            }
        }
        int maxi = Integer.MIN_VALUE;
        for(int i : ans){
            maxi = Math.max(i,maxi);
        }
        
        System.out.println(Arrays.toString(ans));
        return maxi;
    }
}