class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int mini = Integer.MAX_VALUE;
        Arrays.sort(nums);
        /* 1 4 7 9 */

    while(j<n){
          
          if(j-i+1 < k){
            j++;
          }
          else{
            int diff = nums[j] - nums[i];
            mini = Math.min(mini, diff);
              i++;
              j++;
          }
          
    }
    return mini;
      
    }
}