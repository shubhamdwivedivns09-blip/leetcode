class Solution {
    public int missingInteger(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int pref=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==1){
                pref+=arr[i];
            }else{
                break;
            }
        }
        for(int ele : arr){
            set.add(ele);
        }
        for(int i=0;i<set.size();i++){
            if(set.contains(pref)){
            pref++;
        }
        }
        return pref;
    }
}