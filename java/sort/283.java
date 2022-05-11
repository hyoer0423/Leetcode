public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                swap(nums,zero++,i);
            }
            
}
        
            
        
    }
    private void swap(int[] nums, int a, int b){
        int c=nums[a];
        nums[a]=nums[b];
        nums[b]=c;
    }
}class 283 {
    
}
