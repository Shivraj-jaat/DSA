class Solution {
    public boolean isEqual(int[] freq1, int[] freq2){
          for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
          }
          return true;
    }
    public boolean checkInclusion(String s1, String s2) {


        int n = s2.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            freq1[ch - 'a']++;
        }

        int i = 0;
        int j = 0;
        int k = s1.length();

        while(j < n){
            char ch = s2.charAt(j);
            freq2[ch - 'a']++;

            if(j-i+1 < k) j++;
            else{
                if(isEqual(freq1, freq2)) return true;
                freq2[s2.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }
        return false;
    }
}