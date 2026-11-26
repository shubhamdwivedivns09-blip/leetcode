class Solution {
    public boolean canAliceWin(int n) {
        int stone = n;
        int rem=10;
        boolean f = true;
        while(stone>=rem){
            stone-=rem;
            rem--;
            f=!f;
        }
        return !f;
    }
}