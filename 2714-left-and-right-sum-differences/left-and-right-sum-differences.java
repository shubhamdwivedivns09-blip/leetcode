class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int[] pre = new int[nums.length];
        if (nums.length == 1) {
            return new int[]{0};
        }
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        int[] suff = new int[nums.length];
        suff[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            suff[j]=suff[j+1]+nums[j];
        }
        ans[0] = Math.abs(suff[1]);
        for(int i=1;i<nums.length-1;i++){
            ans[i] = Math.abs(pre[i-1] - suff[i+1]);
        }
        ans[nums.length-1] = Math.abs(pre[nums.length-2]); 
        return ans;
    }
}