class Solution {
    public boolean threeFibonacciSum(int n) {
        int sum = 0;
        int a = 0;
        int b = 1;

         sum = a + b;

        while(sum < n){
            int c = a + b;
            sum += c;

            if(sum == n) return true;

            sum -= a;

            a = b;
            b = c;

        }
return false;
    }
}