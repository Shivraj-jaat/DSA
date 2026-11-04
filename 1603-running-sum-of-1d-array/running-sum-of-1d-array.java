class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] ans = new int[n];
        // ans[0] = nums[0];

        for(int i=0; i<n; i++){
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}