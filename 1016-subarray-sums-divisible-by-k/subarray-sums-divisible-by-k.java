class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, 1);

        for(int i=0; i<n; i++){
            prefix += nums[i];

            int remainder = prefix%k;
            
            if(remainder < 0){
                remainder += k;
            }

            if(map.containsKey(remainder)){
                count = count + map.get(remainder);
            }

            map.put(remainder, map.getOrDefault(remainder, 0)+1);
        }
        return count;
    }
}