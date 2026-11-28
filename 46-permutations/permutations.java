class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int[] flag = new int[nums.length];
        per(ans,current,flag,nums);
        return ans;
    }
    public static void per(List<List<Integer>> ans ,List<Integer> current,int[] flag,int[] nums){
        if(current.size()==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(flag[i]==0){
                current.add(nums[i]);
                flag[i]=1;
                per(ans,current,flag,nums);
                current.remove(current.size()-1);
                flag[i]=0;
            }
        }
    }
}