class Solution {
    public int singleNonDuplicate(int[] arr) {
        int lo=0;
        int hi=arr.length-1;
        if(arr.length==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[arr.length-1]!=arr[arr.length-2]) return arr[arr.length-1];
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int f=mid;
            int s=mid;
            if(mid>0 && mid<arr.length-1 && arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1] ){
                return arr[mid];
            }
            if(mid>0 && arr[mid]==arr[mid-1]){
                f=mid-1;
            }
            if(mid<arr.length-1 && arr[mid]==arr[mid+1]){
                s=mid+1;
            }
            int lc=f-lo;
            int rc=hi-s;
            if(lc%2==0){
                lo=s+1;
            }else{
                hi=f-1;
            }
        }
        return arr[lo];
    }
}