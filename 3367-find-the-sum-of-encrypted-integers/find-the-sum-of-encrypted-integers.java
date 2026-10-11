class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            int max = 0;
            int count = 0;
            while(nums[i] > 0){
                int ld = nums[i]%10;
                 max = Math.max(max, ld);
                 nums[i] = nums[i]/10;
                 count++;
            }

            for(int j=0; j<count; j++){
                nums[i] = nums[i]*10 + max;
            }
        }
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        return sum;
    }
}