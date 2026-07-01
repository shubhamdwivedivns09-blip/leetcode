class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int arr : nums) {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }
        for(int arr1 : map.values()){
            if(arr1%2!=0){
                return false;
            }
        }
        return true;
    }
}