class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = 1;
        int prod1 = nums[0] * nums[1] * nums[n-1];
        int prod2 = nums[n-1] * nums[n-2] * nums[n-3];
        max = Math.max(prod1, prod2);
     return max;
    }
}