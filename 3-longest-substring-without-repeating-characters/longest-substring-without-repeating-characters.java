class Solution {
    public int lengthOfLongestSubstring(String str) {
        char[] arr = str.toCharArray();
        int res = Integer.MIN_VALUE;
        int lo=0;
        HashMap<Character,Integer> map = new HashMap<>();
        if(arr.length==0) return 0;
        for(int hi=0;hi<arr.length;hi++){
            map.put(arr[hi],map.getOrDefault(arr[hi],0)+1);
            int k = hi-lo+1;
            while(map.size()<k){
                map.put(arr[lo],map.get(arr[lo])-1);
                if(map.get(arr[lo])==0){
                    map.remove(arr[lo]);
                }
                lo++;
                k=hi-lo+1;
            }
            if(map.size()==k){
                k=hi-lo+1;
               res = Math.max(res,k);
            }
        }
        return res;
    }
}