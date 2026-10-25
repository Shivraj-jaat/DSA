class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int maxi = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;

        while(j < n){
            char ch = answerKey.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(ch));

            while((j-i+1)-maxFreq > k && i < n){
                char ch1 = answerKey.charAt(i);
                 map.put(ch1, map.getOrDefault(ch1, 0)-1);
                 i++;
            }
            maxi = Math.max(maxi, j-i+1);
            j++;
        }
        return maxi;
    }
}