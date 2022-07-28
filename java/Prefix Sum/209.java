class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                res = Math.min(res, i - left + 1);
                sum -= nums[left];
                left++;

            }

        }
        if (res == Integer.MAX_VALUE)
            return 0;
        return res;
    }
}