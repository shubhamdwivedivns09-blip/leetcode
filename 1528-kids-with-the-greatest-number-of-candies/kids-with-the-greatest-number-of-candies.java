class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int ex) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]+ex>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}