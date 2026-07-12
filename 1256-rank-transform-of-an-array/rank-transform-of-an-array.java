class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = new int[arr.length];
        for(int i=0;i<copy.length;i++){
            copy[i]=arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int ele : copy){
            if(!map.containsKey(ele)){
                map.put(ele,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}