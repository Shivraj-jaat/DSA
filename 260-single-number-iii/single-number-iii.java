class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
int k = 0;
        for(int a : map.keySet()){
            int freq = map.get(a);
            if(freq==1){
                ans[k] = a;
                k++;
            }
        }
return ans;
    }
}