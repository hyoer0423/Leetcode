class Solution {
    public boolean canJump(int[] nums) {
        int m = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= m) {
                m = Math.max(m, nums[i] + i);
            }

        }
        if (m >= nums.length - 1)
            return true;
        return false;

    }
}