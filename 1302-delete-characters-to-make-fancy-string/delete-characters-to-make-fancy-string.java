class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        int count  = 1;
        StringBuilder sb = new StringBuilder("");

        sb.append(s.charAt(0));

        for(int i=1; i<n; i++){
            char ch = s.charAt(i);

            if(ch == s.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }
            if(count < 3){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}