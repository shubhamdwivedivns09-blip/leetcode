class Solution {
    public int longestOnes(int[] arr, int k) {
        int maxlen=0;
        int l=0;
        int r=0;
        int cnt=0;
        while(r<arr.length){
            if(arr[r]==0) cnt++;
            while(cnt>k){
                if(arr[l]==0) cnt--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}