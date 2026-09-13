class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        for(int i=0; i<n; i++){
            int rev = 0;
           while(nums[i] > 0){
               rev = rev*10 + nums[i]%10;
               nums[i] = nums[i]/10;
           }
           set.add(rev);
        }
        return set.size();
    }
}