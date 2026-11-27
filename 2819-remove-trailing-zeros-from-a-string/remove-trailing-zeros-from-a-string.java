class Solution {
    public String removeTrailingZeros(String num) {
       int n = num.length();

        for(int i=n-1; i>=0; i--){
            char ch = num.charAt(i);

            if(ch != '0'){
                n = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<=n; i++){
            char ch = num.charAt(i);

            sb.append(ch);

        }
    return sb.toString();
    }
}