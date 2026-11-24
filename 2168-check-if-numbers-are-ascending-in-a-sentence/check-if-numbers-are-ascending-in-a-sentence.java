class Solution {
    public boolean areNumbersAscending(String s) {
        int n = s.length();
        int prev = 0;
        int curr = 1;
        StringBuilder num = new StringBuilder();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(ch != ' ' && Character.isDigit(ch)){
                num.append(ch);
            }
            else if(ch == ' ' && num.length() > 0){
                curr = Integer.parseInt(num.toString());

                if(curr <= prev) return false;
                prev = curr;
                num.setLength(0);
            }
        }
        if(num.length() > 0){
               curr = Integer.parseInt(num.toString());
                if(curr <= prev) return false;
         }
              

        return true;
    }
}