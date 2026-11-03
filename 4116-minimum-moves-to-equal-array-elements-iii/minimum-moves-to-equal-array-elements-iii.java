class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int arr : nums){
            max=Math.max(max,arr);
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                sum+=max-nums[i];
            }
        }
        return sum;
    }
}