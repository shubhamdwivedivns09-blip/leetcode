class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length , cols = arr[0].length;
        int lo=0,hi=row*cols-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int midc=mid/cols;
            int midr=mid%cols;
            if(arr[midc][midr]==target){
                return true;
            }
            else if(arr[midc][midr]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return false;
    }
} 