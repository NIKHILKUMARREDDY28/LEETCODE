class Solution {
    public int maxSubArray(int[] nums) {
        int cur = 0;
        int maxi = nums[0];
        for(int a:nums){
            cur += a;
            if(cur > maxi) maxi = cur;
            if(cur < 0) cur = 0;
        }
        return maxi;
    }
}