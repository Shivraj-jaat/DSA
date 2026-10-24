class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxi = 0;

        if(n == 1) return 1;

        while(j < n){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            while(map.get(ch) > 1){
              map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);
                i++;
            }
            maxi = Math.max(maxi, j-i+1);
            j++;
        }

        return maxi;
    }
}