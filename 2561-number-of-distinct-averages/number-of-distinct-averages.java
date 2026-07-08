class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        List<Double> ans = new ArrayList<>();
        while(i<j){
            double sum=(nums[i]+nums[j])/2.0;
            ans.add(sum);
            i++;
            j--;
        }
        double[] arr = new double[ans.size()];
        for (int p = 0; p < ans.size(); p++) {
            arr[p] = ans.get(p);
        }
        HashSet<Double> set = new HashSet<>();
        for(int k=0;k<arr.length;k++){
            set.add(arr[k]);
        }
        return set.size();
    }
}