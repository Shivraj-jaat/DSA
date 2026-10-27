class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = words.size();
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<n; i++){
            char ch = words.get(i).charAt(0);
            sb.append(ch);
        }

        if(sb.toString().equals(s)) return true;
        return false;
    }
}