# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
import math
class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.res=0
        self.dfs(root,0)
        return self.res
    def dfs(self,root,path):
        if root==None:
            return
        if not root.left and not root.right:
            self.res+=path*10+root.val
        self.dfs(root.right,path*10+root.val)
        self.dfs(root.left,path*10+root.val)
