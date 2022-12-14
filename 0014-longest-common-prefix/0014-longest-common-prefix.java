class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
        if (n==0) return "";
        String mins = strs[0];
        for(String str : strs){
            if (mins.length() > str.length()){
                mins = str;
            }
        }
        int c =0;
        for(int i=0;i<mins.length();i++){
            for(int j=0;j<n;j++){
                if(!(mins.charAt(i) == strs[j].charAt(i)) ){
                    return mins.substring(0,i);
                }
            }
            ++c;
        }
        return mins.substring(0,c);
        
    }
}