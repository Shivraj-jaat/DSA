class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int[] ans = new int[2];

        while(i<n){
            if(Math.abs(i-j)>= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference){
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            j++;
            if(j == n){
                i++;
                j = i;
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}