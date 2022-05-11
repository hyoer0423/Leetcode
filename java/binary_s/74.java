class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length, col=matrix[0].length;
        int left=0,right=row*col-1;
        while(left+1<right){
            int mid=(left+right)/2;
            int row_ind=mid/col;
            int col_ind=mid%col;
            int temp=matrix[row_ind][col_ind];
            if (temp==target) return true;
            if (temp<target){
                left=mid;
            }
            else{
                right=mid;
            }
            
            
        }
        if(matrix[left/col][left%col]==target||matrix[right/col][right%col]==target) return true;
        return false;
    }
   
}
    