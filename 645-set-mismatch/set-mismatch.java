class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
     

        for(int key : map.keySet()){
            if(map.get(key)> 1){
                ans[0] = key;
            }

        }
        for(int i=0; i<nums.length; i++){
           if(!map.containsKey(i+1)){
            ans[1] = i+1;
           }
        }
        return ans;
    }
}