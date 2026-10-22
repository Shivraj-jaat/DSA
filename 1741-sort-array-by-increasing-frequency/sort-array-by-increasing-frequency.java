class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int key : map.keySet()){
            list.add(key);
          }

        Collections.sort(list, (a,b)->{
              if(map.get(a) != map.get(b)) return map.get(a)-map.get(b);
              return b-a;
    });
    
          int idx = 0;
          int[] ans = new int[n];
          
          for(int key : list){
            int val = map.get(key);
            while(val>0){
             ans[idx] = key;
             idx++;
             val--;
            }
          }
          return ans;
    }
}