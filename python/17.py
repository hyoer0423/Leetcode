class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        def addi(lis,res):
            resl=[]
            if res==[]:
                return lis
            for i in lis:
                for j in res:
                    resl.append(j+i)
            return resl
        dic={'1':[''],'2':['a','b','c'],'3':['d','e','f'],'4':['g','h','i'],'5':['j','k','l'],'6':['m','n','o'],'7':['p','q','r','s'],'8':['t','u','v'],'9':['w','x','y','z']}
        res=[]
        for i in digits:
            
            res=addi(dic[i],res)
        return res
        
class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        dic={'1':[''],'2':['a','b','c'],'3':['d','e','f'],'4':['g','h','i'],'5':['j','k','l'],'6':['m','n','o'],'7':['p','q','r','s'],'8':['t','u','v'],'9':['w','x','y','z']}

        if len(digits)==0:
            return []
        if len(digits)==1:
            return dic[digits]
        
        res=self.letterCombinations(digits[1:])
        resl=[]
        for i in dic[digits[0]]:
            for j in res:
                resl.append(i+j)
        return resl