class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        int subCount = 0;
        map.put(0, 1);

        for(int i=0; i<n; i++){
            prefix += nums[i];
            int remain = prefix - k;

            if(map.containsKey(remain)){
                  subCount = subCount + map.get(remain);
            }

            map.put(prefix, map.getOrDefault(prefix, 0)+ 1);

         

        }
        return subCount;
    }
}