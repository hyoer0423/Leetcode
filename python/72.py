class Solution(object):
    def minDistance(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: int
        """
        w1,w2,opened=word1,word2,set()
        topens=[(w1,w2,0)]
        while True:
            (w1,w2,value)=topens.pop(0)
            if (w1,w2) in opened:
                continue
            if w1==w2:
                return value
            opened.add((w1,w2))
            while w1 and w2 and w1[0]==w2[0]:
                w1=w1[1:]
                w2=w2[1:]
            value=value+1
            topens+=[(w1[1:],w2,value),(w1,w2[1:],value),(w1[1:],w2[1:],value)]
        return -1
            