class Solution {
    public boolean isPowerOfFour(int n) {
        /* 
        1 4 16 64
        */
       if(n <= 0) return false;

       while(n%4 == 0){
        n = n/4;
       } 
       if(n == 1) return true;
        return false;
    }
}