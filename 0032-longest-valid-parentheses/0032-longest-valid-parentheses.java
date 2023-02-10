class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else{
                if(!st.isEmpty() && s.charAt(st.peek()) == '('){
                    st.pop();
                }else{
                    st.push(i);
                }
            }
        }
        if(st.isEmpty()) return n;
        int ans = 0;
        int cur = n;
        while(!st.isEmpty()){
            int top = st.pop();
            ans = Math.max(ans,cur-top-1);
            cur = top;
        }
        ans = Math.max(ans,cur);
        
    return ans;
    }
    
}