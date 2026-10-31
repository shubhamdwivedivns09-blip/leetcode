class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 1_000_000_007;

        long[][][] dp = new long[m + 1][n + 1][2];

        dp[0][0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                long right = dp[i][j][0];
                long down = dp[i][j][1];

                if (grid[i][j] == 0) {

                    dp[i][j + 1][0] =
                        (dp[i][j + 1][0] + right + down) % MOD;

                    dp[i + 1][j][1] =
                        (dp[i + 1][j][1] + right + down) % MOD;

                } else {

                    dp[i + 1][j][1] =
                        (dp[i + 1][j][1] + right) % MOD;

                    dp[i][j + 1][0] =
                        (dp[i][j + 1][0] + down) % MOD;
                }
            }
        }

        return (int) ((dp[m - 1][n - 1][0]
                     + dp[m - 1][n - 1][1]) % MOD);
    }
}