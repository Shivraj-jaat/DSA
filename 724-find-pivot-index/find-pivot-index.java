class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        
        // int[] prefix = new int[n];
        // int[] suffix = new int[n];
        // prefix[0] = nums[0];
        // suffix[n-1] = nums[n-1];
 
        // for(int i=1; i<n; i++){
        //     prefix[i] = prefix[i-1] + nums[i];
        // }

        // for(int i=n-2; i>=0; i--){
        //     suffix[i] = suffix[i+1] + nums[i];
        // }

        // for(int i=0; i<n; i++){
        //     if(prefix[i] == suffix[i]){
        //         return i;
        //     }
        // }

 /*
 Optimised code:- we optimised space here 
 */

 int prefix = 0;
 int suffix = 0;
 int total = 0;

 for(int i=0; i<n; i++){
    total = total + nums[i];
 }

 for(int i=0; i<n; i++){
    suffix = total - prefix;
    prefix += nums[i];

    if(prefix == suffix){
        return i;
    }
 }

return -1;
    }
}