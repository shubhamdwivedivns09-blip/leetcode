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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode value = q.poll();
                list.add(value.val);
                if(value.left!=null) q.add(value.left);
                if(value.right!=null) q.add(value.right);
            }
            ans.add(list);
        }
        return ans;
    }
}