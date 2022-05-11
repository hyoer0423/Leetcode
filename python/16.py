class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        res=[]
        for i in range(len(nums)-2):
            if nums[i]==nums[i-1]:
                continue
            l=i+1
            r=len(nums)-1
            pr= abs(nums[i]+nums[l]+nums[r]-target)
            while l<r:
                su=abs(nums[i]+nums[l]+nums[r]-target)
                if su==0:
                    res.append([nums[i],nums[l],nums[r]])
                if su> abs(nums[i]+nums[l]+nums[r-1]-target):
                    r=r-1
                    
                elif su> abs(nums[i]+nums[l+1]+nums[r]-target) :
                   
                    l=l-1
              
               
        return res
            