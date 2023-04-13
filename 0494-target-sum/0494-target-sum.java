class Solution {
    static int helper(int i,int sum,int tar,int[] arr){
        if(i == arr.length){
            return (tar == sum) ? 1 : 0;
        }
        else{
            int pos = helper(i+1,sum-arr[i],tar,arr); 
            int neg = helper(i+1,sum+arr[i],tar,arr);
            return pos + neg;
        }
    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper(0,0,target,nums);
    }
}