class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int n = list1.length;
        int min = 0;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String s = list1[i];
            map.put(s, i);
        }
     ArrayList<String> list = new ArrayList<>();
     int mini = Integer.MAX_VALUE;

        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                 if(i + map.get(list2[i]) < mini){
                    list.clear();
                    mini  = i + map.get(list2[i]);
                    list.add(list2[i]);
                 }
                 else if(i + map.get(list2[i]) == mini){
                     list.add(list2[i]);
                 }
            }
        }
          String[] array = list.toArray(new String[0]);;
          return array;
    }
}