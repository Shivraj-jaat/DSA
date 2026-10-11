class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                int len = sb.length();
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(ch);
            }
        }
        return new String(sb);
    }
}