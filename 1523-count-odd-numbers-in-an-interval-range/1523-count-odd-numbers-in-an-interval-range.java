class Solution {
    public int countOdds(int low, int high) {
        int so = (low %2 !=0) ? 1 : 0;
        int diff = (high - low + 1) ;
        if (diff % 2 ==0) return diff/2;
        return diff/2 + so;
        
    }
}