class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/4){
                ans = key;
                break;
            }
        }
        return ans;
    }
}