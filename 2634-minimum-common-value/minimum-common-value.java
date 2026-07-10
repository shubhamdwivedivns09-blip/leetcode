class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        // HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int arr1 : nums1) {
            map1.put(arr1, map1.getOrDefault(arr1, 0) + 1);
        }
        for(int arr2 : nums2){
            if(map1.containsKey(arr2)){
                arr.add(arr2);
            }
        }
        if (arr.isEmpty()) {
            return -1;
        }
        if(arr.size()==1) return arr.get(0);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<min){
                min=arr.get(i);
            }
        }
        return min;
    }
}