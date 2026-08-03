class Solution {
    public int findPoisonedDuration(int[] nums, int dur) {
        int ans=dur;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]>dur)ans+=dur;
            else {
                ans+=(nums[i]-nums[i-1]);
            }
        }
        return ans;
    }
}