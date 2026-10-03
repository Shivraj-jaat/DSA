class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int prefix = 1;
        int count = 0;

        if(k <= 1) return 0;

        while(j < n){
            
            prefix *= nums[j];
           
           while(prefix >= k){
            prefix = prefix/nums[i];
            i++;
           }
           count += j-i+1;
           j++;

        }
        return count;
    }
}