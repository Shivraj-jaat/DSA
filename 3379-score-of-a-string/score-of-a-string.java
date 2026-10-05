class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        int n = s.length();

        for(int i=0; i<n-1; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            int c1 = (int)ch1;
            int c2 = (int)ch2;


            total += Math.abs(c1-c2);
            
        }
        return total;
    }
}