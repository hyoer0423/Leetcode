class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        for i in range(n):
            if nums[i]>=n+1 or nums[i]<0:
                nums[i]=0
        nums.append(2**31-1)
        nums.append(2**31-1)
        for i in range(n):
            if abs(nums[abs(nums[i])])==0 :
                nums[abs(nums[i])]=-abs(nums[i])
            if abs(nums[abs(nums[i])])>0 :
                nums[abs(nums[i])]=-abs(nums[abs(nums[i])])
                
        for i in range(1,n+2):
            if nums[i]>=0:
                return i 