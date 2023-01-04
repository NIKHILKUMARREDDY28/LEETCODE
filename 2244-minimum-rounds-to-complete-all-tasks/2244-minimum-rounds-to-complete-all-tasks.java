class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int ans = 0;
        for(int i : tasks){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int i : freq.values()){
            if (i == 1) return -1;
            ans += (i+2)/3;
        }
        return ans;
        
        
    }
}