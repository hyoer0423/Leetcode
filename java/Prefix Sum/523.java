class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        // int[] res=new int[nums.length];
        // res[0]=nums[0];
        int res = nums[0];
        mp.put(nums[0] % k, 0);
        for (int i = 1; i < nums.length; i++) {
            res = res + nums[i];
            int m = res % k;
            if (m == 0)
                return true;
            if (mp.containsKey(m) && (i - mp.get(m) > 1)) {
                return true;
            } else {
                if (!mp.containsKey(m)) {
                    mp.put(m, i);
                }
            }
        }
        return false;

    }
}