class Solution {
    public long maxSum(int[] arr, int k, int mul) {
        Arrays.sort(arr);
        int l=0;int p=arr.length-1;
        while(l<p){
            int temp=arr[l];
            arr[l]=arr[p];
            arr[p]=temp;
            l++;
            p--;
        }
        long res=0;
        for(int i=0;i<k;i++){
            if(mul>=1){
                res+= 1L *arr[i]*mul;
                mul--;
            }
            else{
                res+=arr[i];
            }
        }
        return res;
    }
}