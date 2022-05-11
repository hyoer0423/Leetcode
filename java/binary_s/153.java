public class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        if (nums==null ||nums.length==0) return 0;
        if(nums[left]<nums[right]) return nums[left];
        while(left+1<right){
            int mid=left+(-left+right)/2;
            if (nums[mid]>=nums[left]){
                left=mid;
            }else{
                right=mid;
            }
        }
        return nums[left]>nums[right] ? nums[right]:nums[left];
    }
}class 153 {
    
}
