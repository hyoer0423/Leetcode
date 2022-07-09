class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> ans = new ArrayList<>();
        _bc(1, k, n, ans);
        return res;
    }

    private void _bc(int index, int k, int n, List<Integer> ans) {
        if (n == 0 && k == 0) {
            res.add(new ArrayList<>(ans));
        }
        if (n < k || k < 0 || n < 0)
            return;

        for (int i = index; i < 10; i++) {
            ans.add(i);
            _bc(i + 1, k - 1, n - i, ans);
            ans.remove(ans.size() - 1);
        }

    }
}