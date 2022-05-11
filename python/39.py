class Solution(object):
        
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res=[]
        candidates.sort(reverse=True)
        can=candidates
        for i in candidates:
            if target-i<0:
                continue
            mid=self.combinationSum([j for j in candidates if j<=i],target-i)
            if target-i==0:
                res.append([i])
                
            if mid!=[]:
                for al in mid :
                    al.append(i)
                    if al not in res:
                        res.append(al)
                
        return res
            
            
class Solution:
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []
        candidates.sort()
        
        def dfs(target, index, path):
            if target < 0:
                return  # backtracking
            if target == 0:
                res.append(path)
                return 
            for i in range(index, len(candidates)):
                
                dfs(target-candidates[i], i, path+[candidates[i]])
        
        dfs(target, 0, [])
        return res