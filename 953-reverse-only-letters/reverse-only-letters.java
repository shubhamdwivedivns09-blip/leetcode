class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int lo=0;
        int hi=ch.length-1;
        while(lo<hi){
            if(!Character.isLetter(ch[lo])){
                lo++;
            }
            else if(!Character.isLetter(ch[hi])){
                hi--;
            }
            else{
                    char temp=ch[lo];
                    ch[lo]=ch[hi];
                    ch[hi]=temp;
                    lo++;
                    hi--;
            }
        }
        return new String(ch);
    }
}