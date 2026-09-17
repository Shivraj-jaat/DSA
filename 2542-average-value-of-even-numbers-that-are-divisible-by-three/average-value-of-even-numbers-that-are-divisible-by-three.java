class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int average = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i]%2 == 0 && nums[i]%3 == 0){
                count++;
                average += nums[i];
            }
        }
        if(count == 0) return 0;
        return (average/count);
    }
}