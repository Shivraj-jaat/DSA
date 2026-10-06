class Solution {

    public int sum(int[] nums){
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
           if(nums[i]%2==0){
              sum += nums[i];
           }
        
        }  
         return sum;
    }

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int idx = queries[i][1];
            int val = queries[i][0];
            nums[idx] = nums[idx] + val;
            ans[i] = sum(nums);
        }
        return ans;
    }
}