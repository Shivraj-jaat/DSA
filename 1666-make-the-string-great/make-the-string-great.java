class Solution {
    public String makeGood(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
             int len = sb.length();

           if(len > 0 && Math.abs(sb.charAt(len-1) - ch) == 32){
                sb.deleteCharAt(len-1);
             }
             else{
                sb.append(ch);
             }
             
            
        }
        return new String(sb);
    }
}