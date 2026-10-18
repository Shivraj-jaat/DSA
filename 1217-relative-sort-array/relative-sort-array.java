class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i=0; i<n; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }
        int[] ans = new int[n];
        n = arr2.length;
        int idx = 0;

        for(int i=0; i<n; i++){
             if(map.containsKey(arr2[i])){
                while(map.get(arr2[i]) > 0){
                    ans[idx] = arr2[i];
                    idx++;
                     map.put(arr2[i], map.getOrDefault(arr2[i], 0)-1);
                }
                if(map.get(arr2[i])==0) map.remove(arr2[i]);
                     arr2[i] = -1;
             }
        }
n = arr1.length;

      for(int key : map.keySet()){
        while(map.get(key) > 0){
        ans[idx] = key;
        idx++;
        map.put(key, map.getOrDefault(key, 0)-1);

        }
      }
        return ans;
    }
}