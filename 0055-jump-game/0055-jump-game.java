class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        for(int i=0;i<=max && max < n-1;i++){
            max = Math.max(max,i+nums[i]);
        }
        return max >= n-1;
        
    }
}