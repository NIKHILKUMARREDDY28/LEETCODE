class Solution {
    private static void my_fun(int left,int right,String sb,int n,List<String> ans){
        if(sb.length() == 2 * n){
            ans.add(sb);
            return;
        }
        if(left < n){
            
            my_fun(left+1,right,sb+"(",n,ans);
        }
        if( right < left){
            
            my_fun(left,right+1,sb + ")",n,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        my_fun(0,0,"",n,ans);
        return ans;
    }
}