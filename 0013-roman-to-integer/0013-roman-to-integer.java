class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> dic = new HashMap<>();
        dic.put('I',1);
        dic.put('V',5);
        dic.put('X',10);
        dic.put('L',50);
        dic.put('C',100);
        dic.put('D',500);
        dic.put('M',1000);
        int val = 0;
        
        char[] arr = s.toCharArray();
        val += dic.get(arr[0]);
        for(int i=1;i<arr.length;i++){
            val += dic.get(arr[i]);
            if(dic.get(arr[i]) > dic.get(arr[i-1])){
                val -= 2 * dic.get(arr[i-1]);
            }
        }
        return val;
    }
}