class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int cost = 0;
        int maxi = 0;

        while(j < n){
            char ch1 = s.charAt(j);
            char ch2 = t.charAt(j);

            cost += Math.abs(ch1-ch2);

            while(cost > maxCost && i < n){
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);
               
                cost -=Math.abs(c1-c2);
                i++;
            }
             maxi = Math.max(maxi, j-i+1);
             j++;
          
        }
        return maxi;
    }
}