class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int max=-1;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int lo=1;
        int hi=1000000000;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long hr=0;
            for(int i=0;i<arr.length;i++){
                hr+=(int)Math.ceil((arr[i]*1.0)/mid);
            }
            if(hr<=h){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}