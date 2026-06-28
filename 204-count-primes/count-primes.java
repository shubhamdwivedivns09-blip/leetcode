class Solution {
    public int countPrimes(int n) {
    if (n <= 2) return 0;
    int cnt=0;
    int[] ans=Primes(n);
    for(int i=2;i<n;i++){
        if(ans[i]==1){
            cnt++;
        }
    }return cnt;

    }
    public int[] Primes(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,1);
        arr[0]=0;
        arr[1]=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=0;
                }
            }
        }
        return arr;
    }
}