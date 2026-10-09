class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        char ans = ' ';
    
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<n+1; i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                ans = ch;
            }
            else{
                   map.put(ch, map.getOrDefault(ch, 0)-1); 
                   if(map.get(ch)==0){ map.remove(ch);}
            }
        }
       return ans;
    }
}