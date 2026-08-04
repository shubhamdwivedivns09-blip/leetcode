class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int[] nums = new int[max-min+1];
        for(int i=0;i<max-min+1;i++){
            nums[i]=min+i;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}