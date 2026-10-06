class Solution {
    public int maximumWealth(int[][] nums) {
        /*  
      0  1 2 3
      1  3 2 1
         */
         int n = nums.length;
         int m = nums[0].length;
       
         int maxi = 0;

         for(int i=0; i<n; i++){
               int sum = 0;
                 for(int j=0; j<m; j++){
                   sum += nums[i][j];
                 }
                 maxi = Math.max(maxi, sum);
              
         }
return maxi;
    }
}