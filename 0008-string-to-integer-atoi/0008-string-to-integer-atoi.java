class Solution {
    private boolean is_num(char a){
        int cur = a - '0';
        return cur >=0 && cur <=9 ;
    }
    public int myAtoi(String s) {
        int n = s.length();
        int ans = 0;
        int sign = 1;
        int i=0;
        if(s.isEmpty()) return 0;
        while(i < n && s.charAt(i) == ' ') i++;
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i++) == '-') sign = -1;
        }
        while(i < n && is_num(s.charAt(i))){
            int prev = ans;
            ans = ans * 10 + s.charAt(i++) - '0';
            if (prev != ans/10) 
                return (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            
        }
        return sign * ans;
    }
}