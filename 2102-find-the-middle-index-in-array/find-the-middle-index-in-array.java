class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        int[] suff = new int[nums.length];
        suff[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            suff[j]=suff[j+1]+nums[j];
        }
        if (nums.length==1) {
            return 0;
        }
        if (suff[1] == 0) {
            return 0;
        }
        for(int i=1;i<nums.length-1;i++){
            if(pre[i-1]==suff[i+1]){
                return i;
            }
        }
        if (pre[nums.length - 2] == 0) {
            return nums.length - 1;
        }
        return -1;
    }
}