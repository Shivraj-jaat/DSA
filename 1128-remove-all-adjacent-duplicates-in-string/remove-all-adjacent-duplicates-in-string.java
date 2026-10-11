class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        //sb.append(s.charAt(0));
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int len = sb.length();

            if(len > 0 && ch == sb.charAt(len-1)){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(ch);
            }
        }
        return new String(sb);

    }
}