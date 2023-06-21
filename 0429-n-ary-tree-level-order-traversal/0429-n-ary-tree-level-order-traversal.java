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
        if (root == null ) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            List<Integer> tem = new ArrayList<>();
            int len = q.size();
            for(int i=0;i<len;i++){
                Node t = q.remove();
                if(t != null){
                    tem.add(t.val);
                for(Node w : t.children){
                    q.add(w);
                    }
                }
            }
            ans.add(tem);
        }
        return ans;
    }
}