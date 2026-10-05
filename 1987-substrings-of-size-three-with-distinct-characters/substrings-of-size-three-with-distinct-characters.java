class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int lo=0;
        int count=0;
        for(int hi=0;hi<s.length();hi++){
            map.put(s.charAt(hi),map.getOrDefault(s.charAt(hi),0)+1);
            int len = hi-lo+1;
            if(len==3){
                if(map.size()==3){
                    count++;
                }
                map.put(s.charAt(lo),map.get(s.charAt(lo))-1);
                if(map.get(s.charAt(lo))==0){
                    map.remove(s.charAt(lo));
                }
                lo++;
            }
        }
        return count;
    }
}