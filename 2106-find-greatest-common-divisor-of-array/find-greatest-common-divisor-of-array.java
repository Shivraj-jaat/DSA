class Solution {
    public int findGCD(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            mini = Math.min(nums[i], mini);
            maxi = Math.max(nums[i], maxi);

        }
        for(int i=0; i<mini; i++){
              if(mini%(i+1)==0 && maxi%(i+1)==0){
                ans = i+1;
              }
        }
        return ans;
    }
}