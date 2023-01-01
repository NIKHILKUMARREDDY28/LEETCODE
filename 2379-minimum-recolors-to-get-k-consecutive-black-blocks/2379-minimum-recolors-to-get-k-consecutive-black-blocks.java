class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        
        int l = 0,r=0;
        int ans = Integer.MAX_VALUE;
        int w =0;
        
        while (r < n ){
            if(blocks.charAt(r) == 'W'){
                w++;
            }
            if(r - l + 1 == k){
                ans = Math.min(ans,w);
                if(blocks.charAt(l) == 'W') w--;
                ;
                l++;
            }
            r++;
        }
        return ans;
    }
}