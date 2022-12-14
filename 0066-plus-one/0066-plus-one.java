class Solution {
    public int[] plusOne(int[] nums) {
        int car = 1;
        for(int i=nums.length-1;i>=0;i--){
            int ans = (nums[i] + car ) % 10 ;
            car = (nums[i] + car) / 10;
            nums[i] = ans;
            if(car == 0) break;
        }
        if (car == 1){
            int su[] = new int[nums.length+1];
            su[0] = 1;
            for(int i=0;i<nums.length;i++) su[i+1] = nums[i];
            return su;
        }
        return nums;
    }
}