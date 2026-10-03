class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int total = 0;
        int sum = 0;
        int maxi = -1;


        for(int p=0; p<n; p++){
            total += nums[p];
        }
        int rem = total - x;
        if(total < x) return -1;
        if(rem == 0) return n ;

        while(j < n){
            sum += nums[j]; 
            if(sum < rem){
                j++;
            }
            else if(sum == rem){
                maxi = Math.max(maxi, j-i+1);
                 j++;               
            }
            else{
                 while(sum > rem){
                    sum -= nums[i];
                    i++;
              }
              if(sum == rem){
               maxi = Math.max(maxi, j-i+1);
                  }
               j++;

            }     
        }
        if(maxi == -1) return -1;
        return n-maxi;
    }
}