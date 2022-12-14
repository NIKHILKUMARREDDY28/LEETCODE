class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> dic = new HashMap<>();
        dic.put('}','{');
        dic.put(')','(');
        dic.put(']','[');
        for(char c : s.toCharArray()){
            if(c == '[' || c == '{' || c == '('){
                st.push(c);
            }
            else{
                if (st.size() == 0) return false;
                char a = st.pop();
                if(!(dic.get(c) == a)){
                    return false;
                }
            }
        }
        return st.size() == 0;
    }
}