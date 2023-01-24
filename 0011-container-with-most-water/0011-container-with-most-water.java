class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxi = Integer.MIN_VALUE;
        int l = 0;
        int r = n-1;
        while(l < r){
            if(height[l] > height[r]){
                while(height[l] > height[r]){
                    maxi = Math.max(maxi,Math.min(height[l],height[r])* (r - l));
                    r--;
                }
            }
            else{
                    while( l < r && height[l] <= height[r]){
                        maxi = Math.max(maxi,Math.min(height[l],height[r])* (r - l));
                        l++;
                    }
                }
        }
        return maxi;
    }
}