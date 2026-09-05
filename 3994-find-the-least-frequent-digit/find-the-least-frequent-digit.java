class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minFreq = Integer.MAX_VALUE;
        int ans = 0;

        while(n>0){
            int ld = n%10;
            map.put(ld, map.getOrDefault(ld, 0) + 1);
            n = n / 10;
        }

    for(int key : map.keySet()) {
            int freq = map.get(key);
            if (freq < minFreq) {
                ans = key;
                minFreq = freq;
            }
        }
        return ans;
    }
}