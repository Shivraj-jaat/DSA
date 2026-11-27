class Solution {
    public boolean isPrime(int n){

        if(n < 2){
            return false;
        }

        for(int i=2; i*i <= n; i++){
            if(n%i == 0) return false;
        }
    return true;
    }

    public boolean isSetBit(int n){
        int setBit = 0;
        while(n > 0){
            int digit = n%2;
            if(digit == 1) setBit++;
            n = n / 2;
        }

        boolean ans = isPrime(setBit);
        return ans;
        
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
    
        for(int i=left; i<=right; i++){
            if(isSetBit(i)){
                count++;
            }
        }
        return count;
    }
}