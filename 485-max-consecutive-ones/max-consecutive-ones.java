class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}