class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o'|| ch=='u'){
            return true;
        }
        else return false;
    }
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int count = 0;
       
       for(int i=0; i<n; i++){
           HashSet<Character> set = new HashSet<>();
        for(int j=i; j<n; j++){
         
            char ch = word.charAt(j);
            // if(!isVowel(ch)) break;
            if("aeiou".indexOf(ch) == -1) break;

            set.add(ch);

            if(set.size() == 5) count++; 
        }
       }
  
      return count; 
    }
}