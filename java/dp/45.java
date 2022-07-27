class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1)
            return 0;
        int m = nums[0];
        int rtn = 1;
        int m_next = m;
        for (int i = 0; i < nums.length; i++) {
            if (i <= m) {
                m_next = Math.max(m_next, nums[i] + i);

            } else {
                m = m_next;
                m_next = Math.max(m_next, nums[i] + i);
                rtn++;
            }
            // if (i <= m) {
            // m = Math.max(m, nums[i] + i);
            // }
            // if (m >= nums.length - 1) return ;
            if (m >= nums.length - 1)
                return rtn++;
        }
        return rtn++;

    }

}
