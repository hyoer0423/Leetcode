# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def help(self,start,end):
        if start>end:
            return [None]
        res=[]
        for root in range(start,end+1):
            left=self.help(start,root-1)
            right=self.help(root+1,end)
            for l in left:
                for r in right:
                    ro=TreeNode(root)
                    ro.left=l
                    ro.right=r
                    res.append(ro)
        return res
    def generateTrees(self, n):
        """
        :type n: int
        :rtype: List[TreeNode]
        """
        if n==0:
            return []
        return self.help(1,n)
            
            
        
        