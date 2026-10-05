class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int lo=0;
        int max = 0;
        int ans=0;
        for(int hi=0;hi<s.length();hi++){
            map.put(s.charAt(hi),map.getOrDefault(s.charAt(hi),0)+1);
            int window=hi-lo+1;
            max = Math.max(max,map.get(s.charAt(hi)));
            while(window-max>k){
                map.put(s.charAt(lo), map.get(s.charAt(lo)) - 1);
                if(map.get(s.charAt(lo))==0){
                    map.remove(s.charAt(lo));
                }
                lo++;
                window=hi-lo+1;
            }
            ans=Math.max(ans,window);
        }
        return ans;
    }
}