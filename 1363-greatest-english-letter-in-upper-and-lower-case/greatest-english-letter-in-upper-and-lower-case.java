class Solution {
    public String greatestLetter(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            set.add(ch);
        }

        for(int i=26; i>0; i--){
            char ch = (char) ('A' + i-1);

            if(set.contains(Character.toUpperCase(ch)) && set.contains(Character.toLowerCase(ch))){
                sb.append(ch);
                break;
            }
        }
        return sb.toString();
    }
}