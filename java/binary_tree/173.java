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
class BSTIterator {
    TreeNode node;
    Stack<TreeNode> st = new Stack<>();

    public BSTIterator(TreeNode root) {
        node = root;

    }

    public int next() {

        while (node != null) {
            st.push(node);
            node = node.left;

        }
        if (st.isEmpty())
            return -1;
        TreeNode res = st.pop();
        if (res.right != null) {
            node = res.right;
        }
        return res.val;

    }

    public boolean hasNext() {
        return !(st.isEmpty() && node == null);

    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */