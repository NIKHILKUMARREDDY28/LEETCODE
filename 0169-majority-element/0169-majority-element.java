class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int maj = -1;
        int maxi = 0;
        for(int i : nums){
            int fre = freq.getOrDefault(i,0) + 1;
            if(fre > maxi){
                maj = i;
                maxi = fre;
            }
            freq.put(i,fre);
        }
        return maj;
        
    }
}