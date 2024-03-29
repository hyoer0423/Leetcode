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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList< List<Integer>>res=new LinkedList<>();
        if(root==null) return res;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>  templist=new ArrayList<>();
            while(size-->0){
                TreeNode temp=q.poll();
                templist.add(temp.val);
                
            
            if (temp.left!=null) q.offer(temp.left);
             if (temp.right!=null)  q.offer(temp.right);   
                
            }
            res.addFirst(templist);
       
        }
         return res;
    }
   
        
    
}