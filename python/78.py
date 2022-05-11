class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        
        def dfs(nums):
            if len(nums)==1:
                res=[nums,[]]
                return res
            
            res=dfs(nums[1:])
            ans=[]
            for i in res:
                if i==None:
                    ans.append([nums[0]])
                    continue
                ans.append(i)
                
                ans.append(i+[nums[0]])
                
            return ans
        
        return dfs(nums)
class Solution(object):
    def subsets(self, nums):
        ret = []
        self.dfs(nums, [], ret)
        return ret
    
    def dfs(self, nums, path, ret):
        ret.append(path)
        for i in range(len(nums)):
            self.dfs(nums[i+1:], path+[nums[i]], ret)