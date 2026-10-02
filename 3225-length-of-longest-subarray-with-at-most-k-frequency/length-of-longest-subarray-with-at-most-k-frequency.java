class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int maxi = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(j < n){
            map.put(nums[j], map.getOrDefault(nums[j], 0)+1);

            if(map.get(nums[j])<=k){
                maxi = Math.max(maxi, j-i+1);
            }
            while(map.get(nums[j])>k){
          map.put(nums[i], map.getOrDefault(nums[i], 0)-1);
          if(map.get(nums[i])==0){
            map.remove(nums[i]);
          }
          i++;
            }
            j++;
        }
                // maxi = Math.max(maxi, j-i);
        return maxi;
    }
}