class Solution {
    public void sortColors(int[] nums) {
        int red=-1,blue=nums.length-1;
        int i=0;
        if(nums==null ||nums.length==0) return;
        while(i<=blue){
            if (nums[i]==0){
                red++;
                swap(nums,red,i);
            }
            else if(nums[i]==2){
                
                swap(nums,blue,i);
                blue--;
                i--;
            }
            i++;
        }
       return;
    }
    private void swap(int[] nums, int a, int b){
        int c=nums[a];
        nums[a]=nums[b];
        nums[b]=c;
        return;
    }
}