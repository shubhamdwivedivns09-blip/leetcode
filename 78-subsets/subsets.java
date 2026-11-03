class Solution {
    public void sub(int idx,int[] nums,List<Integer> current,List<List<Integer>>ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        sub(idx+1,nums,current,ans);
        current.remove(current.size()-1);
        sub(idx+1,nums,current,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        sub(0,nums,current,ans);
        return ans;
    }
}