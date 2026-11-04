class Solution {
    public void guess(int idx, List<List<Integer>> ans, List<Integer>current , int[] nums){
        if(idx==nums.length){
            ans.add(new ArrayList<>(current));

        }
        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])){
                continue;
            }
            current.add(nums[i]);
            guess(idx+1,ans,current,nums);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        guess(0,ans,current,nums);
        return ans;
    }
}