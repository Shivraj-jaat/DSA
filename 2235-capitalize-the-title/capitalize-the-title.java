class Solution {
    public String cap(String word){
        int n = word.length();

        if(n <= 2){
            StringBuilder sb1 = new StringBuilder();
            for(int i=0; i<n; i++){
               sb1.append(Character.toLowerCase(word.charAt(i)));
            }
            return sb1.toString();
        }
        else{
            StringBuilder sb = new StringBuilder();
            char ch = word.charAt(0);
            sb.append(Character.toUpperCase(ch));
            for(int i=1; i<n; i++){
                sb.append(Character.toLowerCase(word.charAt(i)));
            }
       return sb.toString();
        }
    }
    public String capitalizeTitle(String title) {
        int n = title.length();

        StringBuilder word = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<n; i++){
            char ch = title.charAt(i);

            if(ch != ' '){
                word.append(ch);
            }
            else if(ch == ' '){
                ans.append(cap(word.toString()));
                ans.append(' ');
                word.setLength(0);
            }
        }
                ans.append(cap(word.toString()));
                word.setLength(0);

        return ans.toString();
    }
}