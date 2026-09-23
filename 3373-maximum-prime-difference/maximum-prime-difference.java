class Solution {
       public boolean prime(int n){
            boolean isPrime = true;

            if(n <= 1){
                isPrime = false;
            }
            else{
                for(int i=2; i*i<=n; i++){
                    if(n%i==0){
                        isPrime = false;
                    }
                }
                
            }
            return isPrime;
        }
    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;
        int first = -1;
        int last = 0;

        for(int i=0; i<n; i++){
             if(prime(nums[i])){
                if(first == -1) first = i;
                last = i;
             }
        }
        return last-first;
    }
}