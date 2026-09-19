class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0; i<n; i++){
            list1.clear();
            while(nums[i] > 0){
                list1.add(nums[i]%10);
                nums[i] = nums[i]/10;
            }
            Collections.reverse(list1);
            for(int j=0; j<list1.size(); j++){
                list2.add(list1.get(j));
            }

        }
        int[] ans = new int[list2.size()];
        for(int i=0; i<ans.length; i++){
              ans[i] = list2.get(i);
        }
        return ans;
    }
}