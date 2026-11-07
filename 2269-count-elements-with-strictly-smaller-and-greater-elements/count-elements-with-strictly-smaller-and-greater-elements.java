class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(maxi < nums[i]){
                maxi = nums[i];
            }
            if(mini > nums[i]){
                mini = nums[i];
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] != maxi && nums[i] != mini) count++;
        }
        return count;
    }
}