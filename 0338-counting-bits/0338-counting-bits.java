class Solution {
    private int my_fun(int n){
        int c = 0;
        while (n!=0){
            c += (n & 1);
            n >>= 1;
        }
        return c;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i] = my_fun(i);
            
        }
        return ans;
    }
}