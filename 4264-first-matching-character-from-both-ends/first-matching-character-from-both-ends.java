class Solution {
    public int firstMatchingIndex(String s) {
        char[] ch = s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            if(ch[i]==ch[j]){
                return i;
            }
            i++;
            j--;
        }
        return -1;
    }
}