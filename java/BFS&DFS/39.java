class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        if (target == 0)
            return res;
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        _bc(candidates, 0, target, list);
        return res;

    }

    private void _bc(int[] candidates, int ind, int target, List<Integer> ans) {
        if (target < 0)
            return;
        if (target == 0) {
            res.add(new ArrayList<Integer>(ans));
            return;
        }
        for (int i = ind; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1])
                continue;
            ans.add(candidates[i]);
            _bc(candidates, i, target - candidates[i], ans);
            ans.remove(ans.size() - 1);

        }
    }

}
