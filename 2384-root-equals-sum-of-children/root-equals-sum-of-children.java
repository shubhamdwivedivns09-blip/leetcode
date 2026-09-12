class Solution {
    public boolean checkTree(TreeNode root) {
        return check(root) == root.val;
    }
    public int check(TreeNode root) {
        int sum = 0;
        if (root.left != null) {
            sum += root.left.val;
        }
        if (root.right != null) {
            sum += root.right.val;
        }
        return sum;
    }
}