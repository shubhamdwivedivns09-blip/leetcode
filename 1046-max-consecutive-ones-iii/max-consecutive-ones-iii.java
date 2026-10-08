class Solution {
    public int longestOnes(int[] arr, int k) {
        int lo=0;
        int cnt1=0;
        int cnt0=0;
        int max=0;
        int ans=0;
        for(int hi=0;hi<arr.length;hi++){
            if(arr[hi]==1){
                cnt1++;
            }else{
                cnt0++;
            }
            if(cnt0 > k) {
                if(arr[lo] == 0) {
                    cnt0--;
                }
                lo++;
            }
            max = Math.max(max,cnt1);
            int window = hi-lo+1;
            if(window-max<=k ){
                ans=Math.max(ans,window);
                window = hi-lo+1;
            }else if(window-max>k){
                lo++;
                window = hi-lo+1;
            }
            
        }
        return ans;
    }
}