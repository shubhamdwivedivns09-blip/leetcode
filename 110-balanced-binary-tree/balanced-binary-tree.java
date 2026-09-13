/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        boolean lh = isBalanced(root.left);
        boolean rh = isBalanced(root.right);
        boolean ans = Math.abs(bal(root.left)-bal(root.right))<=1;
        return lh&&rh&&ans;
    }
    public int bal(TreeNode root){
        if(root==null) return -1;
        int ls = bal(root.left);
        int rs = bal(root.right);
        return 1+Math.max(ls,rs);
    }
}