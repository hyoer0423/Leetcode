class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        start=0
        res=0
        wid=0
        add=0
        bar=[j for j in height if j!=0]
        height.append(0)
        for i in range(len(height)-1) :
            
            if height[i]>height[i+1] and height[i]>=start:
                
                if height[i]<start:
                    res=res-wid*(start-height[i])
                start=height[i]
                wid=0
                add=0
                # print(i,res)
                continue
            if start<height[i]:
                continue
            res=res+(start-height[i])
            wid=wid+1
            # print(i,res)
            
        base=0
        for i in range(len(height)-2, -1, -1):
            if height[i]>base:
                base=height[i]
            if height[i]==start:
                break
            # print(i,res)
            res=res-(start-base)
            
        
        return res
            
##method2
class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if len(height)==0or max(hright)==0:
            return
        max_hh=max(height)
        index=height.index(max_hh)
        
        self.res=0
        self.area(height[:index])
    
        self.area(height[index+1:][::-1])
        return self.res
    def area(self,h):
        if len(h)==0 or max(h)==0:
            return
        max_h=max(h)
        index=h.index(max_h)
        self.res+=(len(h)-index-1)*max_h-sum(h[index+1:])
        self.area(h[:index])
        