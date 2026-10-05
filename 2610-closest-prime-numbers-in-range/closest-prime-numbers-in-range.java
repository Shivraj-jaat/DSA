class Solution {
    public boolean isPrime(int n){
        boolean isPrime = true;
        if(n <= 1) {
            isPrime = false;
        }
        else{
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        }
        return isPrime;
    }
    public int[] closestPrimes(int left, int right) {
        // int temp = 0;
        int minGap = Integer.MAX_VALUE;
        int[] ans = {-1, -1};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=left; i<=right; i++){
               if(isPrime(i)){
                  list.add(i);
             }
        }
    /* 11 13 17 19   */
        for(int i=0; i<list.size()-1; i++){
            int diff = list.get(i+1)-list.get(i);
            if(diff < minGap){
                minGap = diff;
                ans[0] = list.get(i);
                ans[1] = list.get(i+1); 
            }
        }
        return ans;
    }
}