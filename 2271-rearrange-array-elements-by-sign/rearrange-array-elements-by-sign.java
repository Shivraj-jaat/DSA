class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int idx1 = 0;
        int idx2 = 0;


        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                pos[idx1] = nums[i];
                idx1++;
            }
            else{
                neg[idx2] = nums[i];
                idx2++;
            }
        }
          idx1 = 0;
          idx2 = 0;
        for(int i=0; i<n; i++){
           if(i%2==0){
            nums[i] = pos[idx1];
            idx1++;
           } 
           else{
            nums[i] = neg[idx2];
            idx2++;
           } 
        }
     return nums;
    }
}