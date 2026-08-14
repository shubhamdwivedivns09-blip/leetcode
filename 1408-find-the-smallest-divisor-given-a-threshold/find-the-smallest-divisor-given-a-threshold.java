class Solution {
    public int smallestDivisor(int[] arr, int x) {
        int lo=1;
        int hi=1000000;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long hr=0;
            for(int i=0;i<arr.length;i++){
                hr+=(int)Math.ceil((arr[i]*1.0)/mid);
            }
            if(hr<=x){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}

