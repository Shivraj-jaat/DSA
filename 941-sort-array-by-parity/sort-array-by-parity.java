class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i = 0;
        int j = n-1;
        int idx = 0;

        while(i <= j){
            if(nums[idx]%2==0){
                result[i] = nums[idx];
                i++;
            }
            else if(nums[idx]%2 != 0){
                result[j] = nums[idx];
                j--;
            }
            idx++;
        }
        
      return result;  
    }
}