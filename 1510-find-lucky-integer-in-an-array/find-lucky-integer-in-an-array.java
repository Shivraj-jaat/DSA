class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l_number = -1;

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int x : map.keySet()){
            if(x == map.get(x)){
                l_number = x;
            }

        }
        return l_number;
    }
}