class Solution {
    public int distributeCandies(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        if(set.size()<n/2){
            return set.size();
        }
        return n/2;
    }
}