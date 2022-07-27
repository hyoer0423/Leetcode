class Solution {
    public int maxSubArray(int[] nums) {

        if (nums.length == 0 || nums == null)
            return 0;

        int maxx = 0;
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            maxx = Math.max(maxx + temp, temp);
            res = Math.max(res, maxx);

        }
        return res;

    }
}