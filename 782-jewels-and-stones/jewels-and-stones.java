class Solution {
    public int numJewelsInStones(String a, String b) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int sum=0;
        for(int i=0;i<b.length();i++){
            char ch =b.charAt(i);
            if(map.containsKey(ch)){
                sum+=map.get(ch);
            }
        }
        return sum;
    }
}