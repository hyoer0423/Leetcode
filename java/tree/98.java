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
    public boolean isValidBST(TreeNode root) {
       if(root==null ||(root.left==null &&root.right==null)) return true;
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    
    }
    private boolean isValidBST(TreeNode root, long low,long up){
        if(root==null) return true;
        if(root.val<=low || root.val >=up) return false;
        return isValidBST(root.right,root.val,up) && isValidBST(root.left,low,root.val);
        
        
        
    }
}