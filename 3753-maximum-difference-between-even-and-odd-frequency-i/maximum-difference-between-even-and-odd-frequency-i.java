class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int even = Integer.MAX_VALUE;
        int odd = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) % 2 == 0){
                if(map.get(ch) < even) even = map.get(ch);
            } else {
                if(map.get(ch) > odd) odd = map.get(ch);
            }
        }
        return odd-even;
    }
}