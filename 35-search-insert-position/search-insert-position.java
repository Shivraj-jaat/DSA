class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int ans = 0;

        while(l <= h){
            int mid = l + (h-l)/2;

            if(nums[mid] == target){
                ans = mid;
                break;
            }
            else if(nums[mid] > target){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        if(ans == 0) ans = l;
        return ans;
    }
}