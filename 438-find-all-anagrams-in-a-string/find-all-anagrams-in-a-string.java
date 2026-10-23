class Solution {
    public boolean isEqual(int[] freq1, int[] freq2){
          for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
          }
          return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int k = p.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0; i<k; i++){
            char ch = p.charAt(i);
            freq1[ch - 'a']++;
        }

        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(j < s.length()){
            char ch = s.charAt(j);
            freq2[ch - 'a']++;

            if(j-i+1 < k) j++;
            else{
                if(isEqual(freq1, freq2)) list.add(i);
                freq2[s.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }
        return list;
    }
}