class Solution {

    public boolean exist(char[][] nums, String word) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[0].length; j++) {

                if (nums[i][j] == word.charAt(0)) {

                    if (ws(nums, word, i, j, 0))
                        return true;

                }

            }

        }

        return false;
    }

    public boolean ws(char[][] nums, String w, int i, int j, int idx) {

        if (idx == w.length())
            return true;

        if (i < 0 || i >= nums.length || j < 0 || j >= nums[0].length)
            return false;

        if (nums[i][j] != w.charAt(idx))
            return false;

        char a = nums[i][j];

        nums[i][j] = '#';

        boolean f = ws(nums, w, i + 1, j, idx + 1) ||
                    ws(nums, w, i - 1, j, idx + 1) ||
                    ws(nums, w, i, j + 1, idx + 1) ||
                    ws(nums, w, i, j - 1, idx + 1);

        nums[i][j] = a;

        return f;
    }
}