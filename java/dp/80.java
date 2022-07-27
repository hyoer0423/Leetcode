class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        int c = 0;
        while (i < nums.length) {

            if (i == 0 || nums[i] == nums[i - 1]) {
                c++;
            }
            if (c == 0 || c == 1) {
                nums[j] = nums[i];
                j++;
                i++;
            }

            if (c == 2) {
                while (i < nums.length && nums[i] == nums[i - 1]) {
                    i++;
                }
                c = 0;
                i--;

            }

        }
        return j;

    }
}