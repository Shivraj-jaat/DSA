class Solution {
    public int minimumIdx(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;

        while (l < h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] > nums[h]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    public int bs(int[] arr, int target, int l, int h) {
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int miniIdx = minimumIdx(nums, target);

        int right = bs(nums, target, miniIdx, n - 1);

        if (right == -1) {
            return bs(nums, target, 0, miniIdx - 1);
        }
        return right;
    }
}