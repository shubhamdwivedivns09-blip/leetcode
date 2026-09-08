class Solution {
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
    }
    public void rev(char[] ch,int lo, int hi){
        if(lo>=hi) return;
            char temp=ch[lo];
            ch[lo]=ch[hi];
            ch[hi]=temp;
            rev(ch,lo+1,hi-1);
    }
}