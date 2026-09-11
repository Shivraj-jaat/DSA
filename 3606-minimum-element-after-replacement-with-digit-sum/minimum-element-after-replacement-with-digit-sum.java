class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = 0;
            while(nums[i] > 0){
                 sum = sum + nums[i]%10;
                 nums[i] = nums[i]/10;
            } 
            nums[i] = sum; 
            if(min > sum){
                min = sum;
            } 
        }
        
     return min;
    }
}