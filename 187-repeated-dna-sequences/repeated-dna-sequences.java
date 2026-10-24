class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        while(j < n){
            int count = 0;
            char ch = s.charAt(j);
            if(j-i+1 < 10){
                j++;
            }
            else{
                
                String s1 = s.substring(i, j+1);
                if(!set.contains(s1)){
                   set.add(s1);
                }
                else{
                    set1.add(s1);
                }
              
              
                i++;
                j++;
            }
        }
        return new ArrayList<>(set1);
    }
}