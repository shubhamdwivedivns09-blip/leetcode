class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n=arr.length;
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            if(k>0){
                for(int j=1;j<=k;j++){
                    sum+=arr[(i+j)%n];
                }
            }else if(k<0){
                for(int j=1;j<=-1*k;j++){
                    sum+=arr[(i-j+n)%n];
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}