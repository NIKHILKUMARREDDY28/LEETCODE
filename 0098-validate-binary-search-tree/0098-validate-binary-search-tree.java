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
    private boolean helper(long lef,long rig,TreeNode root){
        if(root == null) return true;
        if(root.val <= lef || root.val >= rig) return false;
        return helper(lef,root.val,root.left) && helper(root.val,rig,root.right);
    }
    public boolean isValidBST(TreeNode root) {
        return helper(Long.MIN_VALUE,Long.MAX_VALUE,root);
    }
}