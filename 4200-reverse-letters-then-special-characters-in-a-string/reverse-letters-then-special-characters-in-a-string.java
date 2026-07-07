class Solution {
    public String reverseByType(String s) {
        char[] ch = s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(Character.isLetter(ch[i])){
                i++;
            }
            else if(Character.isLetter(ch[j])){
                j--;
            }
            else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
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