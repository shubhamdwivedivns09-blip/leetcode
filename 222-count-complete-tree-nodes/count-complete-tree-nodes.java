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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l=lc(root);
        int r=rc(root);
        if(l==r){
            return (int)Math.pow(2,l)-1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public int lc(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+lc(root.left);
    }
    public int rc(TreeNode root){
        if(root==null){
            return 0;
        }
        return rc(root.right)+1;
    }
}