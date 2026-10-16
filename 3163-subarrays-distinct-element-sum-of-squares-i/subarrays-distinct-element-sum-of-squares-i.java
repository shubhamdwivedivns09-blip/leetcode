class Solution {
    public int sumCounts(List<Integer> nums) {
        int cnt=0;
        int ans=0;
        for(int i=0;i<nums.size();i++){
        HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<nums.size();j++){
                set.add(nums.get(j));
                cnt=set.size();
                ans += cnt*cnt;

            }

        }
        return ans;
    }
}