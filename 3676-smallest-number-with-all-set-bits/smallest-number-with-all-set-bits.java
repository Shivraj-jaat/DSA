class Solution {
    public boolean isSet(int n){
        while(n > 0){
            int digit = n%2;
            n = n / 2;
            if(digit == 0) return false;
        }
        return true;
    }

    public int smallestNumber(int n) {
        
        while(true){
            boolean ans = isSet(n);

            if(ans == true) break;
            n++;
        }
         return n; 
    }
}