class Solution {
    public int signFunc(double multi){
        if(multi > 0){
            return 1;
        }
        else if(multi < 0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public int arraySign(int[] nums) {
        int n = nums.length;
        double multi = 1;

        for(int i=0; i<n; i++){
            multi *= nums[i];
        }
        return signFunc(multi);
    }
}