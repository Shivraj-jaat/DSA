class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(n-1-i);
            if(ch2 == ch1){
               ans = Math.min(ans, i);
            }
        }
        if(ans != Integer.MAX_VALUE)  return ans;
        return -1;
       
    }
}