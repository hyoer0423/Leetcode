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
    public void recoverTree(TreeNode root) {
        LinkedList<Integer> lis = inorder_travese(root);
        System.out.println(lis);
        int[] wrong = new int[2];
        int c = 0;
        for (int i = 1; i < lis.size(); i++) {
            if (lis.get(i - 1) > lis.get(i)) {
                if (c == 0) {
                    wrong[0] = lis.get(i - 1);
                    wrong[1] = lis.get(i);
                    c++;
                } else {
                    wrong[1] = lis.get(i);
                }

            }

        }
        System.out.println(wrong[0]);
        System.out.println(wrong[1]);
        change_travese(root, wrong[0], wrong[1]);

    }

    private LinkedList inorder_travese(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null)
            return list;
        Stack<TreeNode> st = new Stack<>();

        TreeNode cur = root;
        while (cur != null || !st.isEmpty()) {
            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                cur = st.pop();
                list.add(cur.val);
                cur = cur.right;

            }

        }
        return list;
    }

    private void change_travese(TreeNode root, Integer x, Integer y) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null)
            return;
        Stack<TreeNode> st = new Stack<>();

        TreeNode cur = root;
        while (cur != null || !st.isEmpty()) {
            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                cur = st.pop();
                if (cur.val == x) {
                    cur.val = y;
                } else if (cur.val == y) {
                    cur.val = x;
                }
                cur = cur.right;

            }

        }

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
    public void recoverTree(TreeNode root) {
        LinkedList<Integer> lis = new LinkedList<>();
        inorder_travese(root, lis);
        System.out.println(lis);
        int[] wrong = new int[2];
        int c = 0;
        for (int i = 1; i < lis.size(); i++) {
            if (lis.get(i - 1) > lis.get(i)) {
                if (c == 0) {
                    wrong[0] = lis.get(i - 1);
                    wrong[1] = lis.get(i);
                    c++;
                } else {
                    wrong[1] = lis.get(i);
                }

            }

        }
        System.out.println(wrong[0]);
        System.out.println(wrong[1]);
        change_travese(root, wrong[0], wrong[1]);

    }

    private void inorder_travese(TreeNode root, LinkedList lis) {
        if (root == null)
            return;
        inorder_travese(root.left, lis);
        lis.add(root.val);
        inorder_travese(root.right, lis);

    }

    private void change_travese(TreeNode root, int x, int y) {
        if (root == null)
            return;
        change_travese(root.left, x, y);
        if (root.val == x) {
            root.val = y;
        } else if (root.val == y) {
            root.val = x;
            return;

        }
        change_travese(root.right, x, y);

    }
}