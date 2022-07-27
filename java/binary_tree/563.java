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
    int res = 0;

    public int findTilt(TreeNode root) {
        if (root == null)
            return res;
        if (root.left == null && root.right == null)
            return res;

        Sum(root);
        return res;

    }

    private int Sum(TreeNode root) {
        if (root == null)
            return 0;
        int a = Sum(root.left);
        int b = Sum(root.right);
        res = res + Math.abs(a - b);
        return root.val + a + b;
    }
}