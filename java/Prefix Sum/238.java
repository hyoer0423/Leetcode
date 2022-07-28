class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int l=nums.length;
        // int[] pro=new int[l+1];
        // int[] lat=new int[l+1];
        // int[] ans=new int[l];
        // pro[0]=1;
        // lat[0]=1;
        // for(int i=1; i<pro.length;i++){
        // pro[i]=pro[i-1]*nums[i-1];
        // lat[i]=lat[i-1]*nums[l-i];
        // }

        // for(int j=0;j<l;j++){
        // ans[j]=pro[j]*lat[l-j-1];
        // }
        // return ans;
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int r = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * r;
            r = r * nums[i];
        }
        return res;

    }
}
