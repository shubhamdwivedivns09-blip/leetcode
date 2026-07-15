class Solution {
    public boolean canBeEqual(int[] tar, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : tar){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int num : arr){
            if(!map.containsKey(num)){
                return false;
            }
            map.put(num, map.get(num) - 1);

            if (map.get(num) == 0) {
                map.remove(num);
            }
        }
        return map.isEmpty();
    }
}