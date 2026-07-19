class Solution {
    public int numberOfSpecialChars(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (map.containsKey(Character.toUpperCase(ch)) &&
                map.containsKey(Character.toLowerCase(ch)) &&
                !set.contains(ch)) {

                set.add(ch);
            }
        }
        return set.size();
    }
}