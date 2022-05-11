class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        lis=[]
        n=len(matrix)
        
        for i in range(n/2):
            for j in range(n-n/2):
               
                matrix[i][j],matrix[~j][i],matrix[~i][~j],matrix[j][~i]=matrix[~j][i],matrix[~i][~j],matrix[j][~i],matrix[i][j]