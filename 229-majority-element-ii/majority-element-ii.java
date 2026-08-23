class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int i : map.keySet()){
            int freq = map.get(i);
            if(freq > n/3){
                list.add(i);
            }
        }
        return list;
    }
}