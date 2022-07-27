class Solution {
    public int removeDuplicates(int[] nums) {

        int slow = 0, fast = 1;
        while (fast < nums.length) {
            while (fast < nums.length && nums[slow] == nums[fast]) {
                fast++;
            }
            if (fast < nums.length && (slow + 1) < nums.length) {
                nums[slow + 1] = nums[fast];
                slow++;
                fast++;
            }

        }
        return slow + 1;
    }
}