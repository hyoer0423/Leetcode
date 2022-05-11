class Solution(object):
    def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        que=[]
        for i in tokens:
            if i not in "+-*/":
                print(i)
                que.append(i)
            else:
                m=float(que.pop())
                print(que,i)
                n=float(que.pop())
                if i==u'/':
                    que.append(str(n/m))
                elif i==u'*':
                    que.append(str(n*m))
                elif i==u'+':
                    print('here+')
                    print(str(n+m))
                    que.append(str(n+m))
                elif i==u'-':
                    que.append(str(n-m))
        
        return que.pop()