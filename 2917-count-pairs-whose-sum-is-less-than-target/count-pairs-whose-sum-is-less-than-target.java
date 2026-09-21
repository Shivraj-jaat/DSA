class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;

        Collections.sort(nums);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums.get(i) + nums.get(j) < target && i<j){
                    count++;
            }
            }
        }
      
        return count;
    }
}