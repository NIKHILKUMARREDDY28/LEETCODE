class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        double ans = 0;
        int l =0;
        for(int i = 0;i<k;i++) sum += nums[i];
        ans = sum / k;
        for(int i =k;i<n;i++){
            sum -= nums[l++];
            sum += nums[i];
            ans = Math.max(ans,sum/k);
        }
        return ans;
    }
}