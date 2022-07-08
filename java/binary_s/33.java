class Main {
    public int search(int[] nums, int target) {
        if (nums.length<1 ||nums==null) return -1;
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[left]==target) return left;
            if(nums[right]==target) return right;
            if (nums[mid]==target)  return mid;
            if (nums[left]<nums[mid]){
                if (nums[left]<target && nums[mid]>target){
                    right=mid-1;
                    }
                else{
                    left=mid+1;
                    }
                
            }
            else{
                 if (nums[mid]<target && nums[right]>target){
                    left=mid+1;
                    }
                else{
                    right=mid-1;
                    }
                
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Main myobj=new Main();
        int res=myobj.search(new int[]{4,5,6,7,0,1,2},3);
        System.out.println(res);
      }
    
}
