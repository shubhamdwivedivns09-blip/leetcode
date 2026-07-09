class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans = new int[arr.length];
        int i=0;
        int j=0;
        while(j<ans.length){
            if(arr[i]!=0){
                ans[j]=arr[i];
                i++;
                j++;
            }
            else{
                ans[j]=0;
                j++;
                if(j<arr.length){
                ans[j]=0;
                j++;
                }
                i++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k] = ans[k];
        }
    }
}