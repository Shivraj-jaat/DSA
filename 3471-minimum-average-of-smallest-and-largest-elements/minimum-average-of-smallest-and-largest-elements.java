class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        double minElement = 0;
        double maxElement = 0;

        Arrays.sort(nums);

       int i = 0;
       int j = n-1;
       double average = 0;
       double ans = Integer.MAX_VALUE;

       while(i < j){
        minElement = nums[i];
        maxElement = nums[j];
        i++;
        j--;
        average = (minElement+maxElement)/2;
        ans= Math.min(ans, average);
       }
    return ans;
    }
}