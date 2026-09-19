class Solution {
    public boolean validDigit(int n, int x) {
        boolean isFlag1 = false;
        boolean isFlag2 = false;

        while(n > 0){
            int ld = n%10;
          
            if(ld == x){
                isFlag1 = true;
            }

            if(n<10 && n != x){
               isFlag2 = true;
            }
              n = n/10;
        }
        return (isFlag1 && isFlag2);
    }
}