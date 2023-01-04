class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int ans = 0;
        for(int i : tasks){
            if (freq.containsKey(i))freq.put(i,freq.get(i) +1);
            else freq.put(i,1);           
        }
        for(int i : freq.values()){
            if (i == 1) return -1;
            ans += (i+2)/3;
        }
        return ans;
        
        
    }
}