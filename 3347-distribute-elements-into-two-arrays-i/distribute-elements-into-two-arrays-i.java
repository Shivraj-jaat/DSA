class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        if(n<=2) return nums;
        list1.add(nums[0]);
        list2.add(nums[1]);
        int idx1 = 0;
        int idx2 = 0;

        for(int i=2; i<n; i++){
            if(list1.get(idx1) > list2.get(idx2)){
                list1.add(nums[i]);
                idx1++;
            }
            else{
                list2.add(nums[i]);
                idx2++;
            }

        }
         idx1 = 0;
         idx2 = 0;
        for(int i=0; i<n; i++){
            if(i<list1.size()){
                nums[i] = list1.get(idx1);
                idx1++;
            }
            else{
                nums[i] = list2.get(idx2);
                idx2++;
            }
        }
     return nums;
    }
}