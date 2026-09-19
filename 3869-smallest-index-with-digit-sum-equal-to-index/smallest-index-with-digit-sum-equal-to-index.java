class Solution {
    public int smallestIndex(int[] nums) {
         int n = nums.length;
         int sum = 0;

         for(int i=0; i<n; i++){
            sum = 0;
            while(nums[i] > 0){
                sum = sum + nums[i]%10;
                nums[i] = nums[i]/10;
            }
            if(sum == i){
                return i;
            }
         }
         return -1;
    }
}