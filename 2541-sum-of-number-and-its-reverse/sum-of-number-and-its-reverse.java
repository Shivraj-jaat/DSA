class Solution {
    public int reverse(int n){
        int rev = 0;
        if(n < 10){
            return n;
        }
        else{
            while(n > 0){
            int ld = n%10;
            rev = rev*10 + ld;
            n = n/10;
            }
        }
     return rev;
    }
    public boolean sumOfNumberAndReverse(int num) {
        
        for(int i=0; i<=num; i++){
            if(i + reverse(i) == num){
                return true;
            }
        }
        return false;
    }
}