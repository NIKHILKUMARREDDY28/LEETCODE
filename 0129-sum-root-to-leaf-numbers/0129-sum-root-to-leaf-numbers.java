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
    private int f(TreeNode cur,int var){
        if (cur == null) return 0;
        if (cur.left == null && cur.right == null) return var * 10 + cur.val;
        return f(cur.left,var * 10 + cur.val) + f(cur.right,var * 10 + cur.val);
    }
    public int sumNumbers(TreeNode root) {
        return f(root,0);
    }
}