class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];
        int diff = 0;
        for (int n : nums) {
            diff ^= n;
        }
        diff = Integer.highestOneBit(diff);
        int[] result = new int[2];
        for (int n : nums) {
            if ((diff & n) == 0) {
                result[0] ^= n;

            } else {
                result[1] ^= n;
            }
        }
        return result;

    }
}