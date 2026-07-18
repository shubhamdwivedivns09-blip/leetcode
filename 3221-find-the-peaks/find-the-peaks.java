class Solution {
    public List<Integer> findPeaks(int[] mon) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<mon.length-1;i++){
            if(mon[i-1]<mon[i] && mon[i]>mon[i+1]){
                ans.add(i);
            }
        }
        return ans;
    }
}