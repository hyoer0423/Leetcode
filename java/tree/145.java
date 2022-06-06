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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList <Integer> res=new LinkedList<>();
        if (root==null) return res;
        postorderTraversal(root,res);
        
        return res;
       
                
         
        
       
    }
    private void postorderTraversal(TreeNode root,List res){
        if (root==null) return;
        postorderTraversal(root.left,res); 
        postorderTraversal(root.right,res);
        res.add(root.val);
        return;
        
        
    }
}