class Solution {
    public int[] twoSum(int[] arr, int target) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            int sum = arr[lo]+arr[hi];
            if(target==sum){
                return new int[]{lo+1,hi+1};
            }
            else if(target<sum){
                hi--;
            }
            else{
                lo++;
            }
        }
        return new int[]{-1,-1};
    }
}