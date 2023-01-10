class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        String ansi = "";
        String[] ans = new String[numRows];
        for(int i=0;i<numRows;i++){
            ans[i] = "";
        }
        int i = 0;
        boolean down = true;
        while(i < n){
            
            for(int j=0;j<numRows && i < n;j++){
                ans[j] += s.substring(i,i+1);
                i++;
            }
            for(int j=numRows-2;j>0 && i < n;j--){
                ans[j] += s.substring(i,i+1);
                i++;
            }
        }
        for(String a : ans) ansi += a;
        return ansi;
    }
}