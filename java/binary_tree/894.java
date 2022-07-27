/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<TreeNode> allPossibleFBT(int n) {

        List<TreeNode> res = new LinkedList();

        if (n == 1) {

            res.add(new TreeNode(0));
            return res;
        }

        if (n % 2 == 0)
            return res;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 || (n - 1 - i) % 2 == 0)
                continue;

            List<TreeNode> left_lis = allPossibleFBT(i);
            List<TreeNode> right_lis = allPossibleFBT(n - 1 - i);

            for (TreeNode a : left_lis) {
                for (TreeNode b : right_lis) {
                    TreeNode root = new TreeNode(0);
                    root.left = a;
                    root.right = b;
                    res.add(root);
                }

            }

        }
        return res;

    }
}