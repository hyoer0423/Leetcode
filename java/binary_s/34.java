class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0 || nums==null) return new int[]{-1,-1};
        final int[] result=new int[2];
        result[0]=searchLeftIndex(nums,target);
        result[1]=searchRightIndex(nums,target);
        return result;
        
        
    }
    private int searchLeftIndex(int[] nums, int target){
            int left=0,right=nums.length-1;
            
            while (left+1<right){
                
                int mid=(left+right)/2;
                
                if (nums[left]==target) return left;
                if (nums[mid]<target){
                    left=mid+1;                    
                }
                else{
                    right=mid;                    
                }
            }
        if (nums[left]==target) return left;
            if (nums[right]==target) return right;
            
            return -1;
        }
    private int searchRightIndex(int[] nums, int target){
            int left=0,right=nums.length-1;
           
            while (left+1<right){
                
                int mid=(left+right)/2;
                
               
                if (nums[mid]>target){
                    right=mid-1;                     
                }
                else{
                    left=mid;                    
                }
            }
            if (nums[right]==target) return right;
            if (nums[left]==target) return left;
            return -1;
        }
}
