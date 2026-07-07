class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='i'){
                sb.append(ch[i]);
            }
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}