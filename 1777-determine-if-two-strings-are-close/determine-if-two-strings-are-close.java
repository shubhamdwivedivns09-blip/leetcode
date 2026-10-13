class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char ch = word1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int arr : map.values()){
            list1.add(arr);
        }
       Collections.sort(list1);
        for(int i=0;i<word2.length();i++){
            char ch = word2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int arr1 : map2.values()){
            list2.add(arr1);
        }
        Collections.sort(list2);
        for(int i=0;i<word2.length();i++){
            char ch = word2.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
        }
        for(int i=0;i<word1.length();i++){
            char ch = word1.charAt(i);
            if(!map2.containsKey(ch)){
                return false;
            }
        }
        return list1.equals(list2);
    }
}