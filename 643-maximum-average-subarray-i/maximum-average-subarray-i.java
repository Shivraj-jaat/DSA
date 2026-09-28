class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;

        while(j < n){
            sum += nums[j];

            if(j-i+1 < k){
                j++;
            } else{
                maxAvg = Math.max(maxAvg, sum/k);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return maxAvg;
    }
}