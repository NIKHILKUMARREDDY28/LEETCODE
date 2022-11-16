class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        int count = 0;
        HashSet<Integer> uniq = new HashSet<>();
        for(char a:s.toCharArray()){
           freq[a-'a'] ++;
        }
        for(int i: freq){
            while( uniq.contains(i) && i != 0){
                --i;
                ++ count;
            }
            uniq.add(i);
        }
        return count;
    }
}