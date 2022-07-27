class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            if (i == 0) {
                res.add(new ArrayList<Integer>(Arrays.asList(1)));
            }
            if (i == 1) {
                res.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
            }
            if (i > 1) {
                List<Integer> num = new ArrayList<>();
                num.add(1);
                for (int j = 1; j < i; j++) {
                    num.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
                num.add(1);
                res.add(num);
            }

        }
        return res;

    }
}