class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

          for(int[] it : matches){
           map1.put(it[0], map1.getOrDefault(it[0], 0) + 1);
           map2.put(it[1], map2.getOrDefault(it[1], 0) + 1);
       }

       for(int key : map1.keySet()){
       if(!map2.containsKey(key)){
            list.get(0).add(key);
       }}

       for(int key : map2.keySet()){
       if(map2.get(key) == 1){
            list.get(1).add(key);
       }}

       Collections.sort(list.get(0));
       Collections.sort(list.get(1));

     return list;  
    }
}