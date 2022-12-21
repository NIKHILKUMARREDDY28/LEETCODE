class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        long targe = target;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return ans;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int left = j+1,right = n-1;
                long tar = targe - nums[i] - nums[j];
                while(left < right){
                    long cur = nums[left] + nums[right];
                    if(cur == tar){
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        ans.add(quad);
                        while(++left < n && nums[left] == quad.get(2));
                        while(--right > 0 && nums[right] == quad.get(3));
                    }else if(cur > tar) right--;
                    else left++;
                }
                while(j+1 < n-2 && nums[j] == nums[j+1]) j++;
            }
            while(i+1 < n-3 && nums[i] == nums[i+1]) i++;
        }
        return ans;
        
    }
}