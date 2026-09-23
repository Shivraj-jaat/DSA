class Solution {

   public boolean isPrime(int n){
       boolean isPrime = true;

       if(n<=1){
        isPrime = false;
       } 
       else{
        for(int i=2; i*i <= n; i++){
            if(n%i==0){
                isPrime = false;
            }
        }
       }
       return isPrime;
       
   }

    public boolean checkPrimeFrequency(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
          
          for(int key : map.keySet()){
            if(isPrime(map.get(key))){
                return true;
            }
          }
          return false;
    }
}