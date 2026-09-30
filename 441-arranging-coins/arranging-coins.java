class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        for(int i=0; i<n; i++){
              if(n>=(i+1)){
                count++;
                n = n-(i+1);              }
        }
        return count;
    }
}