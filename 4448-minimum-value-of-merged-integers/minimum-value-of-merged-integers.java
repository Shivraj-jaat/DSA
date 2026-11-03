class Solution {

    public int count(int n ){
        int count = 1;
        while(n > 0){
            count = count * 10;
            n = n/10;
        }
        return count;
    }

    public int minMergedInteger(int[] nums) {
    
        int n = nums.length;
        int[] arr = new int[n/2];
        int idx = 0;

        for(int i=0; i<n; i+=2){
                arr[idx] = (nums[i] * count(nums[i+1])) + nums[i+1];
                idx++;
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n/2; i++){
           ans = Math.min(ans, arr[i]);
        }

    return ans;
    }
}