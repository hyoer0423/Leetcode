class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i : nums) {
            if (map.containsKey(i)) {
                int j = map.get(i);
                if (j == 2) {
                    map.remove(i);
                } else {
                    map.put(i, j + 1);

                }

            } else {
                map.put(i, 1);
            }
        }

        for (int m : map.keySet()) {
            return m;
        }

        return -1;
    }
}