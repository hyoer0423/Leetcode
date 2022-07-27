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
    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {

        path(root, 0);
        return sum;

    }

    private void path(TreeNode root, int curr) {

        if (root == null)
            return;
        curr = curr << 1 | root.val;

        if (root.left == null && root.right == null) {
            sum = sum + curr;
            return;

        }

        path(root.left, curr);

        path(root.right, curr);

    }

}