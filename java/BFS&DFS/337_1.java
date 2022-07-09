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
    public int rob(TreeNode root) {
        return rob_(root)[0];
    }

    private int[] rob_(TreeNode root) {

        int[] res = { 0, 0 };
        if (root == null)
            return res;
        int[] left = rob_(root.left);
        int[] right = rob_(root.right);
        res[1] = left[0] + right[0];
        res[0] = Math.max(left[1] + right[1] + root.val, res[1]);
        return res;

    }

}