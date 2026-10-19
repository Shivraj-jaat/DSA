class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int p = firstWord.length();
        int q = secondWord.length();
        int r = targetWord.length();

        int p1 = 0;
        int q1 = 0;
        int r1 = 0;

        for(int i=0; i<p; i++){
            char ch = firstWord.charAt(i);
            p1 = p1*10 + (ch - 'a');
        }

         for(int i=0; i<q; i++){
            char ch = secondWord.charAt(i);
            q1 = q1*10 + (ch - 'a');
        }

         for(int i=0; i<r; i++){
            char ch = targetWord.charAt(i);
            r1 = r1*10 + (ch - 'a');
        }
    return p1+q1==r1;
    }
}