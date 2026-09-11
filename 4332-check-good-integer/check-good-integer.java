class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;

        while(n > 0){
             int ld = n%10;
             digitSum = digitSum + ld;
             squareSum = squareSum + ld*ld;
             n = n/10;
        }
        if(squareSum - digitSum >= 50) return true;
        return false;
    }
}