class Solution {
    public int maxVowels(String s, int k) {
        int cnt=0;
        int lo=0;
        int max=0;
        for(int hi=0;hi<k;hi++){
            char ch = s.charAt(hi);
            if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ){
                cnt++;
            }
        }

        max=Math.max(max,cnt);
        for(int hi=k;hi<s.length();hi++){
            char ch=s.charAt(hi);
            if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ){
                cnt++;
                
            }
            if((s.charAt(lo)=='a' || s.charAt(lo)=='e' || s.charAt(lo)=='i' || s.charAt(lo)=='o' || s.charAt(lo)=='u') ){
                cnt--;
            }
            max=Math.max(max,cnt);
            lo++;
        }
    return max;
    }
}