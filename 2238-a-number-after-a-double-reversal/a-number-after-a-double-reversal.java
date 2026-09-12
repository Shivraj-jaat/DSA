class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse = 0;
        int dbReverse = 0;
        int orig = num;

        while(num > 0){
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        num = reverse;

        while(num > 0){
            dbReverse = dbReverse*10 + num%10;
            num = num/10;
        }
        if(orig == dbReverse) return true;
        return false;
    }
}