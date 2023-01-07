class Solution {
    public int reverse(int x) {
        int sym = (x < 0) ? -1 : 1;
        if(sym == -1) x = -1 * x;
        int rev = 0;
        while(x != 0){
            int cur = rev * 10 + x % 10;
            if((cur - (x%10))/10 != rev) return 0;
            rev = cur;
            x /= 10;
        }
        if(rev < 0) return 0;
        return sym * rev;
        
    }
}