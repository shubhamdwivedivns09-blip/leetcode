class Solution {
    public int maxSatisfied(int[] cust, int[] gus, int min) {
        int ex=0;
        for(int i=0;i<cust.length;i++){
            if(gus[i]==0){
                ex+=cust[i];
            }
        }
        System.out.print(ex);
        for(int hi=0;hi<min;hi++){
            if(gus[hi]==1){
                ex+=cust[hi];
            }
        }
        System.out.print(ex);
        int lo=0;
        int max=ex;
        for(int hi=min;hi<cust.length;hi++) {
            if(gus[hi]==1){
                ex+=cust[hi];
            }
            if(gus[lo]==1){
                ex-=cust[lo];
            }   
            max=Math.max(max,ex);
            lo++;
        }
        return max;
    }
}