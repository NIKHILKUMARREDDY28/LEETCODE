class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length - 2;i++){
            int cur = nums[i];
            int l = i + 1, r = nums.length-1;
            while(l < r){
                int rem = cur + nums[l] + nums[r];
                if ( rem > target){
                    if(rem - target < ans){
                        ans = rem - target;
                        sum = rem;
                    }
                    r--;
                }else{
                    if(target - rem < ans ){
                        ans = target-rem;
                        sum = rem;
                    }
                    l++;
                }
            }
        }
        return sum;
        
    }
}