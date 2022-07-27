public /**
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        if (nums.length == 0)
            return null;
        int max_index = 0;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max_index = i;
                max = nums[i];
            }
        }
        TreeNode root = new TreeNode(max);
        int[] nums_left = new int[max_index];
        int[] nums_right = new int[nums.length - max_index - 1];
        for (int j = 0; j < nums.length; j++) {
            if (j < max_index) {
                nums_left[j] = nums[j];
            } else if (j > max_index) {
                nums_right[j - max_index - 1] = nums[j];

            }

        }
        // System.out.println(Arrays.toString(nums_left));
        // System.out.println(Arrays.toString(nums_right));
        root.left = constructMaximumBinaryTree(nums_left);
        root.right = constructMaximumBinaryTree(nums_right);
        return root;

    }
}

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    private TreeNode construct(int[] nums, int start, int end) {
        if (start > end)
            return null;

        int max = nums[start];
        int max_index = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                max_index = i;
            }

        }
        TreeNode root = new TreeNode(max);
        root.left = construct(nums, start, max_index - 1);
        root.right = construct(nums, max_index + 1, end);
        return root;
    }

}