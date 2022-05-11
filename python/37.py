class Solution(object):
    def solveSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: None Do not return anything, modify board in-place instead.
        """
        r3,r9,s9=range(3),range(9),set(str(x) for x in range(1,10))
        def dfs():
            for i,row in enumerate(board):
                for j,char in enumerate(row):
                    if char!='.':continue
                    for x in s9-set([m for m in row])-set([board[k][j]for k in r9])-set(board[i//3*3+m][j//3*3+n] for m in r3 for n in r3):
                        board[i][j]=x
                        if dfs(): return True
                        board[i][j]='.'
                    return False
            return True
        dfs()