class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxi = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;

        while (j < n) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));

            while ((j - i + 1) - maxFreq > k && i < n) {
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) - 1);
                i++;
            }
            maxi = Math.max(maxi, j - i + 1);
            j++;
        }
        return maxi;
    }
}