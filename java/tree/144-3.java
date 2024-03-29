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
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> res=new LinkedList<>();
        if (root == null) return res;
        Stack<TreeNode> st=new Stack<>();
        
        while(root!=null || !st.isEmpty()){
            if (root!=null){
                res.add(root.val);
                st.push(root);
                root=root.left;
            }
            else{
                root=st.pop();
                root=root.right;
                
            }
        }
        return res;
    }
    }
