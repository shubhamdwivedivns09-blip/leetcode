class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int sum=0;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }

        int lo=max;
        int hi=sum;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int cnt=1;
            int csum=0;
            for(int i=0;i<arr.length;i++){
                csum+=arr[i];
                if(csum>mid){
                    cnt++;
                    csum=arr[i];
                }
            }
            if(cnt<=days){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}
