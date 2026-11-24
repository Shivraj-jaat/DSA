class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int total = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            total += nums[i];
        }

        for(int i=0; i<n; i++){
            if(i == n-1) return count;
            int average = (total-nums[i])/(n-i-1);
            

            if(nums[i] > average){
                count++;
            } 
            total = total - nums[i];
        }
        return count;
    }
}