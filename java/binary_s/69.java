class Solution {
    public int mySqrt(int x) {
        if(x<0) return -1;
        if(x<1) return 0;
        if(x>=1 && x<4) return 1;
        
        int left=1,right=x;
        while(left+1<right){
            
            int mid=(left+right)/2;
            if (x/mid==mid) return mid;
            if(x/mid>mid){
                left=mid;
            }
            else{
                right=mid;
            }
        }
        if(x/left==left) return left;
        if(x/right==right) return right;
        if(x/right>right) return right;
        
        return left;
        
        
    }
}