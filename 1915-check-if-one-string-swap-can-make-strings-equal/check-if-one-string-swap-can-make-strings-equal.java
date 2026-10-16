class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int a = -1;
        int b = -1;
        int count = 0;
        

        for(int i=0; i<n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(count == 1){
                    a = i;
                    b = i;
                }
                else if(count == 2){
                    b = i;
                }
                else{
                    return false;
                }
            }
        }
        if(count == 0) return true;
        if(s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a)) return true;
        return false;
    }
}