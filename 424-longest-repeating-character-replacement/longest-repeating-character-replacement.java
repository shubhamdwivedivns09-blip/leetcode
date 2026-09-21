class Solution {
    public int characterReplacement(String s, int k) {
        int max=-1;
        int lo=0;
        int ans =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int hi=0;hi<s.length();hi++){
            char ch = s.charAt(hi);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max=Math.max(max,map.get(ch));
            int window = hi-lo+1;
            if(window-max>k){
                char left=s.charAt(lo);
                map.put(left,map.get(left)-1);
                lo++;
                window--;
            }
            ans = Math.max(ans,window);
        }
        return ans;
    }
}