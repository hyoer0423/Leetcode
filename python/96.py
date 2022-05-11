class Solution(object):
    def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        numTree=[1]*(n+1)
        if n==1 or n==0:
            return 1
        for node in range(2,n+1):
            total=0
            for i in range(1,node+1):
                total+=numTree[i-1]*numTree[node-i]
            numTree[node]=total
        return numTree[n]