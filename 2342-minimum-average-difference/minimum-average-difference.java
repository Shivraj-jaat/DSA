class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long mini = Long.MAX_VALUE;
        int idx = -1;

        long prefix = 0;
        long total = 0;

        for(int i=0; i<n; i++){
            total += nums[i];
        }

        for(int i=0; i<n; i++){
            prefix += nums[i];

            long leftAvg = prefix/(i+1);
            long rightAvg =  0;
            if(i != n-1){
                rightAvg = (total - prefix)/(n-1-i);
            }
            

            long avgDiff = Math.abs(leftAvg - rightAvg);

            if(avgDiff < mini){
                mini = avgDiff;
                idx = i;
            }

        }
return idx;
    }
}