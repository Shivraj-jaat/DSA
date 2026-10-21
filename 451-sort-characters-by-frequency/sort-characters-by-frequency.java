class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        ArrayList<Character> list = new ArrayList<>();

        for(char ch : map.keySet()){
            list.add(ch);
        }

        StringBuilder sb = new StringBuilder("");

        // Collections.sort(list, (a,b) -> map.get(b)-map.get(a));   /* Lambda Expression */
        Collections.sort(list, new Comparator<Character>(){
            public int compare(Character a, Character b){
                    return map.get(b)-map.get(a);
            }
        });

        for(char ch : list){
            int val = map.get(ch);
            while(val > 0){
                sb.append(ch);
                val--;
            }
        }
    return sb.toString();
    }
}