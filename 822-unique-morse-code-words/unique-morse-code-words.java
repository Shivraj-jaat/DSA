class Solution {

        public StringBuilder convertIntoMorse(String str, String[] morse){
            int n = str.length();
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<n; i++){
                char ch = str.charAt(i);

                sb.append(morse[ch - 'a']);
            }
            return sb;
        }


    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<words.length; i++){
              StringBuilder morse1 = convertIntoMorse(words[i], morse);

            if(!set.contains(morse1.toString())){
                count++;
                set.add(morse1.toString());
            }
            morse1.setLength(0);
        }

return count;


    }
}