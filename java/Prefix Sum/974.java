class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int pre = 0, cnt = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            pre = pre + i;
            int mo = pre % k;
            if (mo == 0)
                cnt++;
            if (mo < 0) {
                mo = mo + k;
            }
            int res = 0;
            if (mp.containsKey(mo)) {
                res = mp.get(mo);
                cnt = cnt + res;
            }
            mp.put(mo, res + 1);

        }
        return cnt;

    }
}