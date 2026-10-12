class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        int i = 0;

        while(count < k && i<n){
            char ch = s.charAt(i);

            if(ch == ' '){
                count++;
            }
           if(count < k) sb.append(ch);
            i++;
        }
        return sb.toString();
    }
}