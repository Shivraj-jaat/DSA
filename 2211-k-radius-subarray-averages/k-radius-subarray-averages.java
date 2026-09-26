class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

       Arrays.fill(ans, -1);
        // for(int i=0; i<n; i++){
        //     ans[i] = -1;
        // }

        int i = 0;
        int j = 0;
        long sum = 0;

        while(j < n){
           sum += nums[j];
           if(j-i+1 < 2*k+1){
            j++;
           }
           else{
            ans[k+i] = (int)(sum/(2*k+1));
            sum -= nums[i];
            j++;
            i++;
           }
        }
        return ans;
    }
}