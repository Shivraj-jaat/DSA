class Solution {
    public boolean prime(int n){
        boolean isPrime = true;
        if(n<=1){
             return false;
        }
       else{
        for(int i=2; i*i <= n; i++){
            if(n%i==0){
              return false;
            } 
         }
      }
            return true;
    }
    public int sumOfPrimesInRange(int n) {
        int orig = n;
        int rev = 0;
        while(n > 0){
             rev = rev*10 + n%10;
             n = n/10;
        }

        int sum = 0;

if(rev > orig){
        for(int i=orig; i<=rev; i++){
            if(prime(i)){
                sum += i;
            }
        }
}
else{
     for(int i=rev; i<=orig; i++){
            if(prime(i)){
                sum += i;
            }
        }
}


return sum;
    }
}