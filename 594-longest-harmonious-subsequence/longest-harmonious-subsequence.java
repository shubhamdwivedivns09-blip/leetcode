class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int arr : nums){
            map.put(arr,map.getOrDefault(arr,0)+1);
        }
        int res=0;
        for(int x : map.keySet()){
            if(map.containsKey(x+1)){
                int t =map.get(x+1);
                res=Math.max(res,t+map.get(x));
            }else{
                continue;
            }
        }
        return res;
    }
}