class Solution {
    public boolean search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left+1<right){
            int mid=left+(right-left)/2;
            if (target==nums[mid]||target==nums[left]||target==nums[right]) return true;
            
            
            if (nums[left]==nums[mid]){
                left++;
                continue;
            }
            if(nums[mid]==nums[right]){
                right--;
                continue;
            }
            if(nums[mid]>nums[left]){
                if(target<nums[mid]&&target>nums[left]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else {
                if(target>nums[mid]&&target<nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
                
            }
        }
        if (target==nums[left]||target==nums[right]) return true;
        return false;
    }
}