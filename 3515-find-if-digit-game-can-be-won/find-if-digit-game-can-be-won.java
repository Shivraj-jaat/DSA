class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] <= 9){
                sum1 += nums[i];
            }
            else{
                sum2 += nums[i];
            }
        }

        if(sum1 > sum2 || sum2 > sum1){
            return true;
        }

return false;
    }
}