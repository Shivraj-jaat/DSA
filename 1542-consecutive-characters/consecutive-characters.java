class Solution {
    public int maxPower(String s) {
        int n = s.length();

        if(n==1) return 1;

        int count = 1;
        int maxCount = 0;

        for(int i=0; i<n-1; i++){
           if(s.charAt(i) == s.charAt(i+1)){
            count++;
           }
           else{
            count = 1;
           }
           maxCount = Math.max(maxCount, count);
        }
    return maxCount;
    }
}