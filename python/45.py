class Solution(object):
    def jump(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        if nums==None or len(nums)==0 or len(nums)==1:
            return 0
        step=0
        left=0
        right=0
        for i in range(len(nums)-1):
            right=max(right,i+nums[i])
            if right>len(nums)-2:
                break
            if i==left:
                step+=1
                left=right
        return step+1
                    
                    
                    