class Solution {
    public int findPoisonedDuration(int[] arr, int dur) {
       int ans =dur;
       for(int i=1;i<arr.length;i++){
        if(arr[i]-arr[i-1]>=dur){
            ans+=dur;
        }else{
            ans+=arr[i]-arr[i-1];
        }
       } 
       return ans;
    }
}