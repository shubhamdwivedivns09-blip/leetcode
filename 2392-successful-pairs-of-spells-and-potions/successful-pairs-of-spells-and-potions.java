import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] sp, int[] pos, long success) {
        Arrays.sort(pos);
        int[] ans = new int[sp.length];
        int m = pos.length;
        for (int i = 0; i < sp.length; i++) {
            int left = 0;
            int right = m - 1;
            int index = m;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) sp[i] * pos[mid];
                if (product >= success) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            ans[i] = m - index;
        }
        return ans;
    }
}