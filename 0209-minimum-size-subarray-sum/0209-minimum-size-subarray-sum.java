class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int n = nums.length;
        if (n == 1 && nums[0] == k) return 1;
        int res = Integer.MAX_VALUE;
        int l = 0, r = -1;
        int cur = 0;
        while (r <= n - 1) {
            if (cur < k) {
                if (++r <= n - 1) cur += nums[r];
            } else {
                cur -= nums[l++];
            }
            if (cur >= k) {
                res = Math.min(res, r - l + 1);
            }
        }

        if (res == Integer.MAX_VALUE) return 0;
        return res;
        
    }
}