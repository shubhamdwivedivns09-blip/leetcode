class Solution {
    public void sub(int idx,int[] nums,List<Integer> current,Set<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        sub(idx+1,nums,current,ans);
        current.remove(current.size()-1);
        sub(idx+1,nums,current,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();
        sub(0,nums,current,ans);
        return new ArrayList<>(ans);
    }
}


