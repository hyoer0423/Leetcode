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
    public List<Integer> postorder(Node root) {
         LinkedList<Integer> result=new LinkedList<>();
        if (root==null) return result;
        postorder(result,root);
        return result;
    }
    private void postorder(LinkedList<Integer> res, Node root){
        Node cur=root;
        Stack<Node> stack= new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            res.addFirst(temp.val);
            
            for(Node child: temp.children  ){
                stack.push(child);
            }
            
        }
        
    }
        
    }

