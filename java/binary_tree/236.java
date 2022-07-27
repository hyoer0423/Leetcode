class Solution {
    TreeNode res;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        LCA(root, p.val, q.val, 0);
        return res;

    }

    private int LCA(TreeNode root, int p, int q, int cal) {

        if (root == null)
            return 0;
        int ans;

        int left = LCA(root.left, p, q, cal);
        int right = LCA(root.right, p, q, cal);
        if (root.val == p || root.val == q) {
            ans = left + right + 1;
        } else {
            ans = left + right;
        }

        if (ans == 2) {
            res = root;
            return 4;
        }
        return ans;

    }

}