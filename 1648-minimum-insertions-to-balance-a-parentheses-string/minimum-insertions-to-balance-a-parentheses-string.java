
class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (open % 2 == 1) {
                    cnt++;
                    open--;
                }
                open += 2;
            } else {
                open--;
                if (open < 0) {
                    cnt++;
                    open = 1;
                }
            }
        }

        return cnt + open;
    }
}
