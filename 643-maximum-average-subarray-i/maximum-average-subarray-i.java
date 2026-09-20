class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0; 
        int j = 0;
        double sum = 0;
        double avg = 0;
        double maxAvg = Integer.MIN_VALUE;
        int n = nums.length;

        while(j<n){  
             sum += nums[j];
             avg = sum/(j-i+1);
              if(j-i+1 < k){
                j++;
              }
              else if(j-i+1 == k){
             
                maxAvg = Math.max(maxAvg, avg);
                sum -= nums[i];
                i++;
                j++;
              }
        }
        return maxAvg;
    }
}