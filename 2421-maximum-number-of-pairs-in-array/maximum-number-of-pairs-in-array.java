class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key)%2 == 0){
               ans[0] = ans[0] + map.get(key)/2;
            }
            else if(map.get(key)%2 == 1 && map.get(key)!=1){
                ans[0] = ans[0] + map.get(key)/2 ;
                ans[1]++;
            }
            else{
                ans[1]++;
            }
        }
        return ans;
    }
}