class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] ans = new int[26];
        Arrays.fill(ans, -1);
        int n = s.length();
        int maxi = -1;

        for(int i=0; i<n; i++){
           char ch = s.charAt(i);
           int idx = ch - 'a';
           if(ans[idx] == -1){
            ans[idx] = i;
           }
           else{
              maxi = Math.max(maxi, i-ans[idx]-1);
           }
        }
        return maxi;
    }
}