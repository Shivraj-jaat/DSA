class Solution {
    public int reverse(int x) {
        long rev = 0;
        int ld = 0;
              while(x!=0){
                ld = x % 10;
                rev = rev*10 + ld;
                x /= 10;
              }
              if(rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE){
                return (int)rev;
              }
              return 0;
    }
}