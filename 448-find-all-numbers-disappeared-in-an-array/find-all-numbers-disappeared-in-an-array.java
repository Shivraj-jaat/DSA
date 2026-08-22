class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
       ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            map.put(nums[i], i);
        }

        
        for(int i=0; i<n; i++){
          if(!map.containsKey(i+1)){
            list.add(i+1);
          }
        }
        return list;
    }
}