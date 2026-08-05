class Solution {
    public int findNumbers(int[] nums) {
         int i=0;
         int n = nums.length;
         int count = 0;
         int even = 0;
         while(i<n){
            count = 0;
            while(nums[i]>0){
                 count++;
                 nums[i] = nums[i]/10;
            }
            if(count%2==0){
                even++;
            }
            i++;
         }
       return even;
    }
}