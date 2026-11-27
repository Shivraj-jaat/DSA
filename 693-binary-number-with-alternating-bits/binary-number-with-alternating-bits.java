class Solution {
    public boolean hasAlternatingBits(int n) {

        int digit = n%2;
        n = n/2;

        while(n > 0){
            int digit1 = n % 2;
            n = n/2;

            if(digit1 == digit){
                return false;
            }
            digit = digit1;
        }
        return true;
    }
}