class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

       int count = 0;
       boolean isOdd = false;

        for(int p : map.values()){
            if(p%2 == 0){
             count += p;
            }
            else{
                isOdd = true;
             count += p-1;
            }
        }
       if(isOdd) return count+1;
       return count;
    }
}