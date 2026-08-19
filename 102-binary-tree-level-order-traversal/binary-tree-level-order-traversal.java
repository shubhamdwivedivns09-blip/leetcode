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
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        dfs(root, 0, map);
        return new ArrayList<>(map.values());
    }

    public void dfs(TreeNode node, int level,
            HashMap<Integer, List<Integer>> map){

        if(node == null){
            return;
        }

        if (!map.containsKey(level)) {
            map.put(level, new ArrayList<>());
        }
        map.get(level).add(node.val);
        dfs(node.left, level + 1, map);
        dfs(node.right, level + 1, map);
    }
}