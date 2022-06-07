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
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList res=new LinkedList<>();
        if (root==null) return res; 
        Stack<TreeNode> st=new Stack<>();
        TreeNode cur=root;
        while(cur!=null || !st.isEmpty()){
            if (cur!=null){
                
                st.push(cur);
                cur=cur.left;
                
            }else{
               cur=st.pop();
                res.add(cur.val);
                cur=cur.right;
                
                
            }
            
            
        }
        
        
        return res;

}
}