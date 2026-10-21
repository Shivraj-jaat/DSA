class Solution {
    public String customSortString(String order, String s) {
        int n = s.length();
        int m = order.length();
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
    int idx = 0;
     
            while(idx < m){
                char ch1 = order.charAt(idx);
                if(map.containsKey(ch1)){
                    while(map.get(ch1) > 0){
                        sb.append(ch1);
                          map.put(ch1, map.getOrDefault(ch1, 0)-1);
                    } 
                          if(map.get(ch1) == 0) map.remove(ch1);

                }
                idx++;
            }
        

for(char ch : map.keySet()){
    while(map.get(ch) > 0){
        sb.append(ch);
            map.put(ch, map.getOrDefault(ch, 0)-1);
    }
    
}
 return sb.toString();
       
    }
}