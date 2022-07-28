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

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        parent.put(root, null);
        stack.push(root);
        while (!parent.containsKey(p) || !parent.containsKey(q)) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                parent.put(node.left, node);
                stack.push(node.left);
            }

            if (node.right != null) {
                parent.put(node.right, node);
                stack.push(node.right);
            }

        }
        Set<TreeNode> ancestors = new HashSet<>();
        while (p != null) {
            ancestors.add(p);
            p = parent.get(p);
        }
        while (!ancestors.contains(q)) {
            q = parent.get(q);
        }
        return q;

    }

}