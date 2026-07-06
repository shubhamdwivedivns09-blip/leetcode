class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int lo=0;
        int hi=nums.size()-1;
        int count=0;
        while(lo<hi){
            // int mid=lo+(hi-lo)/2;
            if (nums.get(lo) + nums.get(hi) <target) {
               count += (hi - lo);
                lo++;
            }
            else{
                hi--;
            }
        }
        return count;
    }
}