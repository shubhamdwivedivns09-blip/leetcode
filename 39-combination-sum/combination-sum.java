class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        sum(0,nums,ans,current,0,target);
        return ans;
    }
    public void sum(int idx,int[] nums, List<List<Integer>> ans,List<Integer> current,int sum,int target){
        if (sum == target) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (idx == nums.length || sum > target) {
            return;
        }
        sum+=nums[idx];
        current.add(nums[idx]);
        sum(idx,nums,ans,current,sum,target);
        current.remove(current.size()-1);
        sum-=nums[idx];
        sum(idx+1,nums,ans,current,sum,target);
    }
}