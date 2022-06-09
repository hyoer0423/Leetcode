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
    class subTreeStatus{
        Integer min;
        Integer max;
        boolean Valid;
        public subTreeStatus(Integer min,Integer max, boolean Valid){
            this.min=min;
            this.max=max;
            this.Valid=Valid;
        }
    }
    public boolean isValidBST(TreeNode root) {
        subTreeStatus res=dfs(root);
        return res.Valid;
      
    
    }
    private subTreeStatus dfs(TreeNode root){
        
        if(root==null){
            return new subTreeStatus(null,null,true);
            
        }
        subTreeStatus left=dfs(root.left);
        if(!left.Valid|| (left.min!=null && root.val<=left.min)||(left.max!=null && root.val<=left.max)){return new subTreeStatus(null,null,false);
            }
        subTreeStatus right=dfs(root.right);
        if(!right.Valid|| (right.min!=null && root.val>=right.min)||(right.max!=null && root.val>=right.max)){return new subTreeStatus(null,null,false);
            }
        Integer min=left.min;
        if(left.min==null){
            min=root.val;
        }
        Integer max=right.max;
        if(right.max==null){
            max=root.val;
        }
        return new subTreeStatus(min,max,true);
    }
   
        
        
    }
