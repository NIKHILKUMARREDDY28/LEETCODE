class Solution {
    private boolean my_fun(String s1,int idx1,String s2,int idx2){
        if(idx2 >= s2.length()){
            if(idx1 >= s1.length()) return true;
            return false;
        }
        if(idx1 >= s1.length()) return true;
        if(s1.charAt(idx1) == s2.charAt(idx2)){
            return my_fun(s1,idx1 +1 , s2,idx2+1);
        }else{
            return my_fun(s1,idx1, s2,idx2+1);
        }
    }
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        return my_fun(s,0,t,0);
    }
}