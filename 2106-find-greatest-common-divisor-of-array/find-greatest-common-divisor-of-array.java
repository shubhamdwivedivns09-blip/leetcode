class Solution {
    public int findGCD(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (max % i == 0 && min % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
