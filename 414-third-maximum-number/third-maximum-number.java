class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long Smax =Long.MIN_VALUE;
        long Tmax =Long.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                Tmax = Smax;
                Smax = max;
                max = nums[i];
            } 
            else if(nums[i] > Smax && nums[i] != max){
                Tmax = Smax;
                Smax = nums[i];
            }
             else if(nums[i] > Tmax && nums[i] != Smax && nums[i] != max){
                Tmax = nums[i];
             }
        }
        if(Tmax == Long.MIN_VALUE){
            return (int)max;
        }
        return (int)Tmax;
    }
}