class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q= new ArrayDeque<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode t =q.poll();
                if(flag){
                    list.add(t.val);
                }else{
                    list.add(0,t.val);
                }
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
            }
            flag=!flag;
            ans.add(list);
        }
        return ans;
    }
}