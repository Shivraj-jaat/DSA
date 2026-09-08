class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        HashMap<Integer, Integer> map3 = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            map1.put(nums[i], map1.getOrDefault(nums[i], 0) + 1);
            map2.putIfAbsent(nums[i], i);
            map3.put(nums[i], i);
        }
        int maxDegree = Collections.max(map1.values());

        for(int key : map1.keySet()){
            if(map1.get(key)==maxDegree){
               ans = Math.min(ans, map3.get(key)-map2.get(key)+1);
            }
        }
        return ans;
    }
}