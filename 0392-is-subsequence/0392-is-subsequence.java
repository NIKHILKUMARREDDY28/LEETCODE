class Solution {
    
        
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int p = 0;
        for(int i=0;i<t.length();i++){
            if(p<s.length() && s.charAt(p) == t.charAt(i)){
                p ++;
            }
        }
        return p == s.length();
    }
}