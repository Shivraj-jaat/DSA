class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        

        for(int i=0; i<k; i++){
            int m = nums[n-1];
           sum += m;
           nums[n-1] = m + 1;
        }
        return sum;
    }
}