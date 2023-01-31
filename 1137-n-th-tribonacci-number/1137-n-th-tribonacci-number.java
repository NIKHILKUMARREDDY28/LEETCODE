class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n == 2) return 1;
        
        int one  = 0,two = 1,three = 1;
        int cur = 0;
        for(int i=3;i<= n;i++){
            cur = three + two + one;
            one = two;
            two = three;
            three = cur;
        }
        return three;
        
    }
}