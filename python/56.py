class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        res=[]
        intervals.sort(key=lambda x:x[0])
        s1=intervals[0][0]
        l1=intervals[0][1]
        for int in intervals[1:]:
            
            if int[0]<=l1 and int[1]>=l1:
                l1=int[1]
            elif int[0]>l1:
                res.append([s1,l1])
                s1=int[0]
                l1=int[1]
                
            
        res.append([s1,l1])
        return res