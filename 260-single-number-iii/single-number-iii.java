class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;

        while(i<nums.length){
        if (i == nums.length - 1) {
            ans.add(nums[i]);
            break;
            }
            if(nums[i]==nums[i+1]){
                i+=2;
            }
            else{
                ans.add(nums[i]);
                i++;
            }
        }
        int[] arr = new int[ans.size()];
        for(int j=0;j<arr.length;j++){
            arr[j]=ans.get(j);
        }
        return arr;
    }
}