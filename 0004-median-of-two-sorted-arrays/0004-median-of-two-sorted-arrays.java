class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        if(n > m) return findMedianSortedArrays(arr2,arr1);
        int mid = (n+m+1)/2;
        double ans = 0;
        int l = 0, r = n ;
        while ( l <= r){
            int c1 = (l + r) >> 1 ;
            int c2 = mid - c1;
            int l1 = (c1 == 0) ? Integer.MIN_VALUE:arr1[c1 - 1];
            int l2 = (c2 == 0) ? Integer.MIN_VALUE:arr2[c2 - 1];
            int r1 = (c1 == n) ? Integer.MAX_VALUE:arr1[c1];
            int r2 = (c2 == m) ? Integer.MAX_VALUE:arr2[c2];
            if(l1 <= r2 && l2 <= r1){
                if((n+m)%2 == 0) return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
                else return Math.max(l1,l2);
            } else if (l1 > r2) {
                r = c1 - 1;
            }else l = c1 + 1;
        }
        return  ans;
    }
}