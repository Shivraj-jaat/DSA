class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        // int[] leftSum = new int[n];
        // int[] rightSum = new int[n];
        int[] ans = new int[n];

        int prefix = 0;
        int suffix = 0;
        int total = 0;

        for(int i=0; i<n; i++){
            total += nums[i];
        }

        for(int i=0; i<n; i++){
            suffix = total - prefix;

            prefix += nums[i];

 
       ans[i] = Math.abs(prefix - suffix);

        }
         return ans;
    }
}