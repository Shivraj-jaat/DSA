class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
         s = s.toLowerCase();
       
        boolean isFlag = false;
        StringBuilder sb = new StringBuilder("");
    

        for(int i=0; i<n; i++){
             char ch = s.charAt(i);
             if((ch >= 'a' && ch <= 'z') || (ch>='0' && ch <= '9')){
                sb.append(ch);
             }
        }
         int i=0;
        int j=sb.length()-1;

        while(i < j){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);

            if(ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }  
        return true;
    }
}