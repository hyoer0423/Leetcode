class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        if(matrix==null || matrix.length==0||matrix[0]==null||matrix[0].length==0) return Integer.MAX_VALUE ;
        int row=matrix.length;
        int col=matrix[0].length;
        PriorityQueue <int[]> q=new PriorityQueue<>(k,new Comparator<int[]>(){
            @Override
            public int compare(int[] i1, int[] i2){
                return matrix[i1[0]][i1[1]]-matrix[i2[0]][i2[1]];
            }
        });
        boolean[][] visited =new boolean[row][col];
        q.offer( new int[]{0,0});
        int result=0;
        while(k-->0){
            int[] cur= q.poll();
            int curRow=cur[0];
            int curCol=cur[1];
            result=matrix [curRow][curCol];
           if(isValid(curRow+1,curCol,row,col,visited)){
            q.offer(new int[] {curRow+1,curCol});
            visited[curRow+1][curCol ]=true;         
                       
                
            }
 if(isValid(curRow,curCol+1,row,col,visited)){
     q.offer(new int[] {curRow,curCol+1});
        visited[curRow][curCol+1 ]=true; 
                
            
            
            
        }
        
        
                 }
        return result;
        
    }
    private boolean isValid (int i, int j ,int row, int col,boolean[][] visited)   {
        return (i>=0 && i<row && j>=0&& j<col &&!visited[i][j]);
    }          
                 
}
                 