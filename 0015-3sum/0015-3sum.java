class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        if ( n < 3) return ans;
        for(int i = 0;i<n-2;i++){
            int left = i+1,right = n-1;
            int tar = 0-nums[i];
            while(left < right){
                int cur = nums[left] + nums[right]; 
                if(cur == tar){
                    List<Integer> trip = new ArrayList<>();
                    trip.add(nums[i]);
                    trip.add(nums[left]);
                    trip.add(nums[right]);
                    ans.add(trip);
                    while(++left < n && nums[left] == trip.get(1));
                    while(--right > 0 && nums[right] == trip.get(2));
                }else if( cur > tar ) right--;
                else left ++;
            }
            while(i+1 < n && nums[i] == nums[i+1]) i++;
        }
        return ans;
    }
}