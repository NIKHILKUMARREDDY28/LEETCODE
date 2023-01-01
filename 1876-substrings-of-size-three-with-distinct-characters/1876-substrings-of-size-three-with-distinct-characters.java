class Solution {
    private boolean is_good(String sa){
        char[] arr = new char[26];
        for(char c : sa.toCharArray()){
            arr[c-'a'] ++;
            if(arr[c-'a'] > 1) return false;
        }
        return true;
    }
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int cnt = 0;
        for(int i=0;i<n-2;i++){
            if(is_good(s.substring(i,i+3))) cnt++;
        }
        return cnt;
    }
}