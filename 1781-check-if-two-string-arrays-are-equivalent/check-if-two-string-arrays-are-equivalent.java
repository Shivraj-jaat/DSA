class Solution {
    public StringBuilder remove(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        int i = 0;

        while(i < n){
              char ch = s.charAt(i);
              sb.append(ch);
              i++;
        }
        return sb;
    }


    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1 = word1.length;
        int n2 = word2.length;
        StringBuilder sb = new StringBuilder("");
        StringBuilder sf = new StringBuilder("");


        for(int i=0; i<n1; i++){
             sb.append(remove(word1[i]));
        }
        
        for(int i=0; i<n2; i++){
             sf.append(remove(word2[i]));
        }
       if(sb.toString().equals(sf.toString())) return true;
       return false;
    }
}