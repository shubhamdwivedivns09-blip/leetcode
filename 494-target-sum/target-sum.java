class Solution {
    public int find(int idx, int sum, int target, int[] nums) {
        int cnt = 0;

        if (idx == nums.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        sum += nums[idx];
        cnt += find(idx + 1, sum, target, nums);

        sum -= 2 * nums[idx];
        cnt += find(idx + 1, sum, target, nums);

        return cnt;
    }

    public int findTargetSumWays(int[] nums, int target) {
        return find(0, 0, target, nums);
    }
}