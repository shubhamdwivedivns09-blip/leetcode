class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] ch = blocks.toCharArray();
        int n = ch.length;
        int lo = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int hi = 0; hi < k; hi++) {
            if (ch[hi] == 'W') {
                count++;
            }
        }
        min = Math.min(min, count);
        for (int hi = k; hi < ch.length; hi++) {
            if (ch[hi] == 'W') {
                count++;
            }
            if (ch[lo] == 'W') {
                count--;
            }
            min = Math.min(min, count);
            lo++;
        }
        return min;
    }
}