class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return same(root, root);
    }

    public boolean same(TreeNode root, TreeNode value) {
        if (root == null) return true;

        boolean ls = same(root.left, value);
        boolean rs = same(root.right, value);

        if (root.val == value.val) {
            return ls && rs;
        } else {
            return false;
        }
    }
}