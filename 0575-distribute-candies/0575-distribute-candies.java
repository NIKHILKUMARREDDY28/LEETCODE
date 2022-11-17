class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int n = candyType.length;
        int count = 1;
        int prev = candyType[0];
        for(int i=1;i<n;i++){
            if(candyType[i] != prev){
                ++ count;
                prev = candyType[i];
            }
        }
        return Math.min(count,n/2);
    }
}