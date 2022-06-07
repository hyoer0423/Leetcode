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
    public int maxDepth(TreeNode root) {
        // if (root==null) return 0;
        // int right=maxDepth(root.right);
        // int left=maxDepth(root.left);
        // if (right>left) return right+1;
        // return left+1;
        if(root==null ) return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        int depth=0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                TreeNode cur=queue.poll();
                if(cur.right!=null)queue.offer(cur.right);
                if(cur.left!=null)queue.offer(cur.left);
            }
            
            depth++;
            
        }
        return depth;
        
        
    }
}