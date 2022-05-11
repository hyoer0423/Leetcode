class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n==1:
            return "1"
        m=self.countAndSay(n-1)
        c=1
        s=''
        for i in range(len(m)-1):
            if m[i]==m[i+1]:
                c=c+1
            else:
                s=s+str(c)+m[i]
                c=1
        s=s+str(c)+m[-1]
        return s