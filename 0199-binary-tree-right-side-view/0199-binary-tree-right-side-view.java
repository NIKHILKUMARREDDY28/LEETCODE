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
    private void f(TreeNode root,int depth,List<Integer> ans){
        if (root == null) return ;
        if (depth == ans.size()) ans.add(root.val);
        f(root.right,depth+1,ans);
        f(root.left,depth+1,ans);
        
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        f(root,0,ans);
        return ans;
    }
}