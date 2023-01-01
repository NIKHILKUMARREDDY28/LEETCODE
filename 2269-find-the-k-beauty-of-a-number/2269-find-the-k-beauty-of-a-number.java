class Solution {
    private boolean beauty(String a,int num){
        int n = Integer.parseInt(a);
        if(n!=0) return num % n == 0;
        return false;
    }
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int cnt = 0;
        for(int i=0;i<=s.length()-k;i++){
            if(beauty(s.substring(i,i+k),num)) cnt++;
        }
        return cnt;
    }
}