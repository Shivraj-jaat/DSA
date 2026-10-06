class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;
        int[] ans = new int[n];

        int idx = 0;

        // 1. Smaller elements
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                ans[idx] = nums[i];
                idx++;
            }
        }

        // 2. Equal elements
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) {
                ans[idx] = nums[i];
                idx++;
            }
        }

        // 3. Greater elements
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) {
                ans[idx] = nums[i];
                idx++;
            }
        }

        return ans;
    }
}