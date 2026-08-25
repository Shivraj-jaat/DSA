class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<=n; i++){
            if(!map.containsKey(k*(i+1))){
                ans = k*(i+1);
                break;
            }
        }
        return ans;
    }

}