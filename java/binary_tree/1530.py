# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countPairs(self, root: TreeNode, distance: int) -> int:
        s = 0
        if(root==None): return 0
        
        def countBranch(root):
            nonlocal s
            res_left=[]
            res_right=[]
            if(root==None):
                return res_left
            if(root.left==None and root.right==None) :
                return [1]
            if(root.left!=None ):
                res_left= countBranch(root.left)
            if(root.right!=None ):
                res_right= countBranch(root.right)
            for i in res_left:
                for j in res_right:
                    if (i+j)<=distance:
                        s=s+1
                        
            return [i+1 for i in res_left+res_right]
        countBranch(root)
        return s