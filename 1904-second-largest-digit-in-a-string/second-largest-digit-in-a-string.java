class Solution {
    public int secondHighest(String s) {
        List<Integer> arr = new ArrayList<>();
        for(int ele : s.toCharArray()){
            if(Character.isDigit(ele)){
                arr.add(ele-'0');
            }
        }
        int max=-1;
        int smax=-1;
        for(int ele1 : arr){
            if(ele1>max){
                max=ele1;
            }
        }
        for(int ele1 : arr){
            if(ele1>smax && ele1!=max){
                smax=ele1;
            }
        }
        return smax;
    }
}