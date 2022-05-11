class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums==null || nums.length==0) return 0;
        int left=0,right=nums.length-1;
        while(left+1<right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid;
            }
            else{
                right=mid;
            }
           
        }
        if (nums[left]>target) return  left>0 ? left-1 :0;
        else if (nums[left]==target) return left;
        else if (nums[left]<target&& target<=nums[right]) return right;
        else return right+1;
            
        
        
        
        
    }
}