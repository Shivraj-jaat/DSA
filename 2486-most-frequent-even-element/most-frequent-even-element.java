class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        int ans = -1;

        for(int i=0; i<n; i++){
             map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int key : map.keySet()){
            if(key%2 == 0){
               if(map.get(key) > maxi){
                maxi = map.get(key);
                ans = key;
            }
            else if(map.get(key) == maxi){
                ans = Math.min(ans, key);
            }
            }
        }
        return ans;
    }
}