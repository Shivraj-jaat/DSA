class Solution {

    public boolean isPrime(int num){
        if(num < 2) return false;

        for(int i=2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
     }

    public List<Integer> maxPrimes(int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum  = 0;
        
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                sum += i;
                if(sum <= s) list.add(i);
                else break;
            }
        }
        return list;
    }
}