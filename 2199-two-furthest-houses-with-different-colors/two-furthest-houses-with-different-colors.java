class Solution {
    public int maxDistance(int[] arr) {
        int max=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    max=Math.max(max,Math.abs(i-j));
                }
            }
        }
        return max;
    }
}