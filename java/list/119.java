class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {

            if (i == 0) {
                res.add(1);
            }
            if (i == 1) {
                res.add(1);
            }
            if (i == 2) {
                res.add(1, 2);
            }
            if (i > 2) {
                int prev;
                prev = res.get(0);
                for (int j = 1; j < i; j++) {
                    int next_prev = res.get(j);
                    res.set(j, (prev + res.get(j)));
                    prev = next_prev;
                }
                res.add(1);

            }

        }
        return res;

    }
}