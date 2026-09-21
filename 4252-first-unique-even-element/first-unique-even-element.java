class Solution {
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(nums[i]%2 == 0){
              map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
            
        }

        for(int i=0; i<n; i++){
            if(nums[i]%2==0 && map.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return -1;
    }
}