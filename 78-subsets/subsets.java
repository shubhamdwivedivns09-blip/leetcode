class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        printsub(nums,current , ans , 0);
        return ans;
    }
    public void printsub(int[] nums , List<Integer> current,List<List<Integer>> ans, int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        printsub(nums,current,ans,idx+1);
        current.remove(current.size() - 1);
        printsub(nums,current,ans,idx+1);
    }
}