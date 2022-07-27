// class Solution {
//     public int maxProduct(int[] nums) {

//         int minn=nums[0];
//         for(int i=0; i<nums.length;i++){
//             int cal=1;

//             for(int j=i; j<nums.length;j++){
//                 cal=cal*nums[j];
//                 minn=Math.max(minn,cal);
//             }

//         }
//         return minn;

//     }
// }
class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int minn = 1;
        int minnn = 1;
        int maxxx = 1;
        int maxx = 1;
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            minnn = Math.min(Math.min(minn * temp, maxx * temp), temp);
            maxxx = Math.max(Math.max(minn * temp, maxx * temp), temp);
            res = Math.max(res, maxxx);
            minn = minnn;
            maxx = maxxx;
        }
        return res;
    }

}