class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int i = 0;
        int j = 0;

        while(i<s.length() && j<n){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);

            if(ch1 == ch2){
                i++; 
                j++;
            }
            else{
                j++;
            }
        }
        if(i == s.length()) return true;
        return false;
    }
}