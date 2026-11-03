class Solution {
    public static void sum(int idx,int target,int[] arr, List<List<Integer>> ans,ArrayList<Integer> current){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(arr[i]>target){
                break;
            }
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            current.add(arr[i]);
            sum(i+1,target-arr[i],arr,ans,current);
            current.remove(current.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        sum(0,target,arr,ans,current);
        return ans;
    }
}