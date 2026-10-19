class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);
/* 1 2 3 4 5 6
1 2 2 3 3 4 5 5 6 */
       return nums[n-k];
    }
}