class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(nums[i]>0 && !set.contains(nums[i])){
                set.add(nums[i]);
            }
        }

           for(int i=0; i<=n; i++){
            if(!set.contains(i+1)){
               return i+1;
            }
        }
       return 0;
    }
}