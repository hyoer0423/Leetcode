class Solution(object):
    def Valid(self,lis):
        if len(set(lis))==len(lis):
            return True
        return False
    
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        for row in board:
            
            if self.Valid([i for i in row if i!='.'])==False:
                return False
        for col in zip(*board):
            if self.Valid([i for i in col if i!='.'])==False:
                return False
        for i in range(0,3,6):
            for j in range(0,3,6):
                if self.Valid([board[x][y] for x in range(i,i+3) for y in range(j,j+3) if board[x][y]!='.'])==False:
                    return False
        return True
        
        