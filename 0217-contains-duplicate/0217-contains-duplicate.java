class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> freq = new HashSet<>();
        for(int a:nums){
           if(freq.contains(a)) return true;
            freq.add(a);
        }
        return false;
    }
}