class Solution {
    private void my_fun(String digi,List<Character> arr,int ind,HashMap<Character,String> comb,List<String> ans){
        if(ind == digi.length()){
            StringBuilder sb = new StringBuilder();
            for (char c : arr) sb.append(c);
            ans.add(sb.toString());
            return;
        }
        char[] arri = comb.get(digi.charAt(ind)).toCharArray();
        for(int i=0;i<arri.length;i++){
            arr.add(arri[i]);
            my_fun(digi,arr,ind+1,comb,ans);
            arr.remove(arr.size()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        
        HashMap<Character,String> comb = new HashMap<>();
        comb.put('2',"abc");
        comb.put('3',"def");
        comb.put('4',"ghi");
        comb.put('5',"jkl");
        comb.put('6',"mno");
        comb.put('7',"pqrs");
        comb.put('8',"tuv");
        comb.put('9',"wxyz");
        List<String> ans = new LinkedList<>();
        List<Character> arr = new ArrayList<>();
        if(digits.isEmpty()) return ans;
        my_fun(digits,arr,0,comb,ans);
        return ans;
        
        
    }
}