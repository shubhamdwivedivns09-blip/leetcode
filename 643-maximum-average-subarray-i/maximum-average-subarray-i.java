class Solution {

    public double findMaxAverage(int[] arr, int k) {

        int lo = 0;
        int hi = k - 1;
        int sum = 0;

        for(int i = lo; i <= hi; i++) {
            sum += arr[i];
        }

        int res = sum;

        while(hi < arr.length - 1) {

            lo++;
            hi++;

            sum -= arr[lo - 1];
            sum += arr[hi];

            res = Math.max(res, sum);
        }

        return (double) res / k;
    }
}