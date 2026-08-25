class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int arr:nums){
            set.add(arr);
        }
        int mul=k;
        while(set.contains(mul)){
            mul+=k;
        }
        return mul;
    }
}