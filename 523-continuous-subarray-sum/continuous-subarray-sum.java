class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        map.put(0, -1);

        for(int i=0; i<n; i++){
            prefix += nums[i];

            int rem = prefix%k;

            if(map.containsKey(rem)){
                if(i-map.get(rem) >= 2){
                    return true;
                }
            }

            if(!map.containsKey(rem)){
                map.put(rem, i);
            }
         
        //    if(!map.containsKey(prefix)){
        //     map.put(i, prefix);
        //    }
        }
      return false;
    }
}