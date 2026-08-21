class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.size()>2){
                map.put(arr[j],map.get(arr[j])-1);
                if(map.get(arr[j])==0){
                    map.remove(arr[j]);
                }
                j++;
            }
            maxlen=Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
}