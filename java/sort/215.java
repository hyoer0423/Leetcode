class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null || nums.length==0 || k<=0) return -1; 
        //find the k biggest number
        return quick_select(nums,0,nums.length-1,nums.length-k);
        
    }
    private int quick_select(int[ ] nums, int begin, int end, int k){
        if(begin>end) return -1;
        int pivot=nums[end];
        int index=begin;
        for (int i=begin; i<end; i++){
            if (nums[i]<=pivot){
                swap(nums,index++,i);
            }
            
        }
        swap(nums,index,end);
        if (index==k) return nums[index];
        else if (index<k) return quick_select(nums, index+1,end,k);
        else return quick_select(nums,0,index-1,k);

        
    }
    private void swap(int[]nums, int a ,int b){
        int c=nums[a];
        nums[a]=nums[b];
        nums[b]=c;
        return;
        
    }
}
