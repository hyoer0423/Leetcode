class Solution(object):
    def numDecodings(self, s):
        """
        :type s: str
        :rtype: int
        """
        dp=[0]*len(s)
        if s[0]!='0':
            dp[0]=1
        for i in range(1,len(s)):
            if s[i]!='0':
                dp[i]=dp[i-1]
            if int(s[i-1:i+1])<=26 and int(s[i-1:i+1])>=10:
                if i==1:
                    dp[i]=dp[i]+1
                else:
                    dp[i]=dp[i]+dp[i-2]
        # print(dp)
        return dp[-1]
        