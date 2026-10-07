class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int n = jewels.length();

        for(int i=0; i<n; i++){
            char ch = jewels.charAt(i);
            set.add(ch);
        }

        int m = stones.length();
        int count = 0;
        
        for(int i=0; i<m; i++){
            char ch = stones.charAt(i);
            if(set.contains(ch)){
                count++;
            }
        }
    return count;
    }
}