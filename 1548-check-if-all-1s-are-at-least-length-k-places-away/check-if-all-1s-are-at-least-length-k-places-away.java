class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        /* 1 0 0 0 1 0 0 1 */
        int n = nums.length;

        if(k == 0) return true;

        int idx = -1;

        for(int i=0; i<n; i++){
            if(nums[i] == 1 && idx == -1){
                idx = i;
            }
            else if(nums[i] == 1 && idx != -1){
                 if(i - (idx+1) < k){
                        return false;
                 }
                 else{
                    idx = i;
                 }
            }
        }
        return true;
    }
}