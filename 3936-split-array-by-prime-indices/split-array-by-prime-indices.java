class Solution {

    public boolean isPrime(int m){
        if(m<2){
            return false;
        } 
        
        for(int i = 2 ; i * i <= m ; i++){
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }

    public long splitArray(int[] nums) {
        int n = nums.length;
        long A = 0;
        long B = 0;
        
        for(int i=0; i<n; i++){
            if(isPrime(i)){
                A += nums[i];
            }
            else{
                B += nums[i];
            }
        }
        return Math.abs(A-B);
    }
}