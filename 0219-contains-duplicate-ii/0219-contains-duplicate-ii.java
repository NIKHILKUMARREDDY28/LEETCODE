class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> se = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(se.containsKey(nums[i])){
                if((i - se.get(nums[i])) <= k) return true;
            }
            se.put(nums[i],i);
        }
        return false;
    }
}