class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans= new ArrayList<>();
        for(int arr :nums1){
            map.put(arr,map.getOrDefault(arr,0)+1);
        }
        for (int arr2 : nums2) {
            if (map.containsKey(arr2) && map.get(arr2) > 0) {
                ans.add(arr2);
                map.put(arr2, map.get(arr2) - 1);

                if (map.get(arr2) == 0) {
                    map.remove(arr2);
                }
            }
        }
        int[] x=new int[ans.size()];
        for(int i=0;i<x.length;i++){
            x[i]=ans.get(i);
        }
        return x;
    }
}