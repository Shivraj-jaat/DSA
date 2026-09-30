class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int mini = Integer.MAX_VALUE;
        int sum = 0;

        while(j < n){
            sum += nums[j];
            if(sum < target){
                j++;
            }
            else if(sum>= target){
                // mini = Math.min(mini, j-i+1);
                while(sum > target){
                mini = Math.min(mini, j-i+1);
                    sum -= nums[i];
                    i++;
                }
                if(sum == target){
                    mini = Math.min(mini, j-i+1);
                }
                j++;
            }
           
        }
        if(mini == Integer.MAX_VALUE){
            return 0;
        }
        return mini;
    }
}