class Solution {
    public boolean checkDivisibility(int n) {
        int orig = n;
        int sum =0;
        int mult = 1;
        while(n>0){
            int ld = n%10;
            n = n/10;
            sum = sum + ld;
            mult = mult * ld;
        }
        int total = sum + mult;

        if(orig%total == 0){
          return true;
        } 
        return false;
    }
}