class Solution {
    public long findTheArrayConcVal(int[] arr) {
        int lo=0;
        int hi=arr.length-1;
        long sum=0;
        while(lo<hi){
            String s = String.valueOf(arr[lo]) + String.valueOf(arr[hi]);
            int num = Integer.parseInt(s);
            sum+=num;
            lo++;
            hi--;
        }
        if(lo==hi){
            sum+=arr[hi];
        }
        return sum;
    }
}