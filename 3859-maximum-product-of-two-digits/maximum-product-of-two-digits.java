class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> l1= new ArrayList<>();
        while(n>0){
           int rem=n%10;
            n=n/10;
            l1.add(rem);
        }
        Collections.sort(l1);
        int x= l1.size();
        return l1.get(x-1)*l1.get(x-2);
    }
}