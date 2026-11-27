class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int count = -1;
       while(n > 0){
        int digit = n%2;
        count++;
        n = n/2;

        if(digit == 1){
            if(count%2 == 0) even++;
            else odd++;
         }
       }
       int[] ans = new int[2];
       ans[0] = even;
       ans[1] = odd;
       return ans;
    }
}