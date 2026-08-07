class Solution {
    public int searchInsert(int[] arr, int tar) {
        int lo =0;
        int hi =arr.length-1;
        int ans=0;
        while(lo <= hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>=tar) {
                ans = mid;
                hi = mid - 1;
            }else if(arr[arr.length-1]<tar){
                return arr.length;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}