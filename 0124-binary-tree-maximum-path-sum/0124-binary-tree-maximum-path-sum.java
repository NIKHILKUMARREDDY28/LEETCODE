/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int f(TreeNode root,int[] res){
        if (root == null) return 0;
        int lp = Math.max(0,f(root.left,res));
        int rp = Math.max(0,f(root.right,res));
        res[0] = Math.max(root.val+lp + rp ,res[0]);
        return root.val + Math.max(lp,rp);
    }
    public int maxPathSum(TreeNode root) {
        int[] res = {Integer.MIN_VALUE};
        f(root,res);
        return res[0];
    }
}