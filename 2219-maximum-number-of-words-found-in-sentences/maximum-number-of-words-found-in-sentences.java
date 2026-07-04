class Solution {
    public int mostWordsFound(String[] sent) {
        int max=0;
        for(String sen : sent){
            int cnt=1;
            for(int j=0;j<sen.length();j++){
                if(sen.charAt(j)==' '){
                    cnt++;
                }
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}