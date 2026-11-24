class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int idx = -1;

       for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(ch == 'b' && idx == -1){
                idx = i;
            }
            else if(ch == 'a' && idx != -1){
                return false;
            }
       } 
       return true;
    }
}