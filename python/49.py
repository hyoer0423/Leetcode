class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dic={}
        for i in sorted(strs):
            key=tuple(sorted(i))
            dic[key]=dic.get(key,[])+[i]
        return dic.values()
            