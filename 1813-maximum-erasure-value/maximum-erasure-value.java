class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int maxi = 0;

        while(j < n){
            while(set.contains(nums[j])){
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            sum += nums[j];
            set.add(nums[j]);
            j++;
            maxi = Math.max(maxi, sum);
           }
        
        return maxi;
    }
}