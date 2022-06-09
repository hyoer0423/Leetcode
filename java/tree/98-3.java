class Solution {
    
    public boolean isValidBST(TreeNode root) {
       return dfs(root,new Integer[1]);
    
    }
    private boolean dfs(TreeNode root, Integer[] prev){
        if(root==null) return true;
        if (!dfs(root.left, prev)) return false;
        if(prev[0]!=null &&prev[0]>=root.val){
            return false;
        }
        prev[0]=root.val;
        return dfs(root.right,prev);
    }
   
        
        
    }

