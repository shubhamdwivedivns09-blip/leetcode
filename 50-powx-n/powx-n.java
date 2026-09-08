class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n>0){
            return pow(x,n);
        }else{
            return 1 / pow(x, -(long)n);
        }
    }
    public double pow(double x, long n){
        if(n<=1) return x;
         double half = pow(x, n / 2);

        if(n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

}

