class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        if (k == 0)
            return result;

        helper(1, n, k, new ArrayList<Integer>());
        return result;

    }

    private void helper(int start, int index, int k, List<Integer> ans) {
        if (k == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for (int i = start; i <= index; i++) {

            ans.add(i);
            helper(i + 1, index, k - 1, ans);
            ans.remove(ans.size() - 1);

        }

    }
}