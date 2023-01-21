class Solution {
    private int f(int i){
        int cur = 0;
        while(i!=0){
            int rem = i%10;
            cur += rem * rem;
            i /= 10;
        }
        return cur;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> freq = new HashSet<>();
        while(!freq.contains(n)){
            if(n==1) return true;
            else {
                freq.add(n);
                n = f(n);  
            }
        }
        return false;
    }
}