class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;

        int diff = 0;
        int p = 0;

        while(diff == 0 && p < n-1){
            diff = nums[p+1] - nums[p];
            p++;
        }

        if(diff >= 0){
            for(int i=0; i<n-1; i++){
                if(nums[i+1]-nums[i] < 0) return false;
            }
        }
        else{
            for(int i=0; i<n-1; i++){
                if(nums[i+1]-nums[i] > 0) return false;
            }
        }
        return true;
    }
}