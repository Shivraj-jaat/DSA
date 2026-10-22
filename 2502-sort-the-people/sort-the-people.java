class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        HashMap<Integer, String> map = new HashMap<>();

        for(int i=0; i<n; i++){
          map.put( heights[i], names[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(Integer s : map.keySet()){
            list.add(s);
        }
        Collections.sort(list, (a, b) -> b - a);

        String[] ans = new String[n];
        int idx = 0;

        for(int s : list){
            ans[idx] = map.get(s);
            idx++;
        }
    return ans;
    }
}