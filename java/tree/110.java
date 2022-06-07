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
    public boolean isBalanced(TreeNode root) {
         if (root==null) return true;
         int right=getDepth(root.right);
        int left=getDepth(root.left);
        if (Math.abs(right-left)>1) return false;
        if(!(isBalanced(root.left)&&isBalanced(root.right)))return false;
        return true;
        
        
    }
    private int getDepth(TreeNode root){
        if (root==null) return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        if (left>right) return left+1;
        return right+1;
        
    }
}