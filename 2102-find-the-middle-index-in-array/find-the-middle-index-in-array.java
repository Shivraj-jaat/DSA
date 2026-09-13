class Solution {
    public int findMiddleIndex(int[] nums) {
        /* 
         p = 2 5 4 12 16
         s = 16 14 11 12 4
         p = 1 0 4
         s = 4 3 4     
        */
        int n = nums.length;
        int prefix = 0;
        int suffix = 0;

        int total = 0;

        for(int i=0; i<n; i++){
            total += nums[i];
        }
        
        for(int i=0; i<n; i++){
            suffix = total - prefix;
            prefix += nums[i];

            if(prefix == suffix) return i;
        }
    return -1;
    }
}