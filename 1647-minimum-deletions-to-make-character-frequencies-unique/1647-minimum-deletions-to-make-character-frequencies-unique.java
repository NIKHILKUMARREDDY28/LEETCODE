class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int count = 0;
        HashSet<Integer> uniq = new HashSet<>();
        for(char a:s.toCharArray()){
            if(freq.containsKey(a)){
                int b = freq.get(a);
                freq.put(a,++b);
            }
            else freq.put(a,1);
        }
        for(int i: freq.values()){
            while( uniq.contains(i) && i != 0){
                --i;
                ++ count;
            }
            uniq.add(i);
        }
        return count;
    }
}