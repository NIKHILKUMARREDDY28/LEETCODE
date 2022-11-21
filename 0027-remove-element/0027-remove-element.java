class Solution {
    public int removeElement(int[] nums, int val) {
        //int cur = 0;
        int pos = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] != val){
                nums[pos++] = nums[i];
            }
        }
        return pos;
    }
}