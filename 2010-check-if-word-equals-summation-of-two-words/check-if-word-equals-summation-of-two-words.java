class Solution {
    public boolean isSumEqual(String f, String s, String tar) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for(char ch : f.toCharArray()){
            sb1.append(ch-'a');
        }
        for(char ch : s.toCharArray()){
            sb2.append(ch-'a');
        }
        for(char ch : tar.toCharArray()){
            sb3.append(ch-'a');
        }
        int one = Integer.parseInt(sb1.toString());
        int two = Integer.parseInt(sb2.toString());
        int three = Integer.parseInt(sb3.toString());
        return one+two==three;
    }
}