class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int prod = 0;
        int maxProd = 0;

        for(int i=0; i<n-1; i++){
             prod = (nums[i] -1) * (nums[i+1] - 1);
             maxProd = Math.max(maxProd, prod);
        }
  return maxProd;
    }
}