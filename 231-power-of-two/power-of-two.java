class Solution {
    public boolean isPowerOfTwo(int n) {
        return power(n,1);
    }
    public boolean power(int n , long power){
        if(power==n) return true;
        if(power>n) return false;
        return power(n,power*2);
    }
}