class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int arr : nums){
            map.put(arr,map.getOrDefault(arr,0)+1);
        } 
        int cnt=0;
        for(int value : map.values()){
            if(value>1){
                cnt+=value*(value-1)/2;
            }
        }
        return cnt;
    }
}