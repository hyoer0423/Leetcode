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
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null) return 0;
        final Queue <TreeNode> nodeQ=new LinkedList<>();
        final Queue <Integer> IndexQ=new LinkedList<>();
        int max=0;
        nodeQ.offer(root);
        IndexQ.offer(0);
        
        
        while(!nodeQ.isEmpty()){
            int size=nodeQ.size();
            int left=0;
            int right=0;
            for(int i=0; i<size;i++){
                TreeNode node=nodeQ.poll();
                int in=IndexQ.poll();
                if(i==0) left=in;
                if (i==size-1) right=in;
                if (node.left!=null){
                    nodeQ.offer(node.left);
                    IndexQ.offer(in*2);
                }
                if(node.right!=null){
                    nodeQ.offer(node.right);
                    IndexQ.offer(in*2+1);
                }
                
            }
            max=Math.max(max,right-left+1);
            
            
        }
        
       return max;
        
        
    }
  
    
       
    
    
}
