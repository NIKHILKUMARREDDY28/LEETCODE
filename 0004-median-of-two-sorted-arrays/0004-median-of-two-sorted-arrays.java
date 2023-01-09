class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int l=0,r=0;
        int k=0;
        int[] arr = new int[n+m];
        while(l < n && r < m){
            if(nums1[l] < nums2[r]) arr[k++] = nums1[l++];
            else arr[k++] =  nums2[r++];
        }
        while(l< n) arr[k++] = nums1[l++];
        while(r < m) arr[k++] = nums2[r++];
        System.out.print(Arrays.toString(arr));
        double left = arr[(n+m)/2];
        double right = ((n+m)%2 != 0) ? arr[(n+m)/2 ] : arr[(n+m)/2 - 1];
        System.out.print(left + " " + right);
        double ans = (left + right)/2;
        return ans;
    }
}