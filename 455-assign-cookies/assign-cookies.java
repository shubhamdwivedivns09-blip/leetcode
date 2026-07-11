class Solution {
    public int findContentChildren(int[] p, int[] t) {
        int i=0, j=0,count=0;
        Arrays.sort(p);
        Arrays.sort(t);
        while(i<p.length && j < t.length){
            if(p[i]<=t[j]){
                count++;
                i++;
                j++;
            }
            else if(p[i]>t[j]){
                j++;
            }

        }
        return count;
    }
}