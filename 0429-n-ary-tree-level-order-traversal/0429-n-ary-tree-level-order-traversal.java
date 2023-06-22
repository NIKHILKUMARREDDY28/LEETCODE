/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int len = q.size();
            for(int i=0;i<len;i++){
                Node temp = q.remove();
                if(temp != null){
                    res.add(temp.val);
                    for(Node v : temp.children){
                    if (v != null ) q.add(v);
                }
                }
                
            }
            ans.add(res);
        }
        return ans;
    }
}