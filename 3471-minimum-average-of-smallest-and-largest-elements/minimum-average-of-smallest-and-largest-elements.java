class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        List<Double> arr=new ArrayList<>();
        int i=0;
        int j= nums.length-1;
        while(i<j){
            double sum=(nums[i]+nums[j])/2.0;
            arr.add(sum);
            i++;
            j--;
        }
        Double min=Double.MAX_VALUE;
        for(int k=0;k<arr.size();k++){
            if(arr.get(k)<min){
                min=arr.get(k);
            }
        }
        return min;
    }
}