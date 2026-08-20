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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String s="";
        fun(root,ans,s);
        return ans;
    }
    public static void fun(TreeNode root,List<String> list,String s){
        if(root==null) return;
        if(!s.equals("")){
            s+="->";
        }
        s+=root.val;
        
        if(root.left==null && root.right==null){
            list.add(s);
            return;
        }
        fun(root.left,list,s);
        fun(root.right,list,s);
    }
}