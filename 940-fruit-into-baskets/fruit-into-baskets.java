class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int lo=0;
        int res=1;
        for(int hi=0;hi<arr.length;hi++){
            map.put(arr[hi],map.getOrDefault(arr[hi],0)+1);
            while(map.size()>2){
                map.put(arr[lo],map.get(arr[lo])-1);
                if(map.get(arr[lo])==0){
                    map.remove(arr[lo]);
                }
                lo++;
            }
            if(map.size()<=2){
                int len = hi-lo+1;
                res=Math.max(res,len);
            }
        }
        return res;
    }
}