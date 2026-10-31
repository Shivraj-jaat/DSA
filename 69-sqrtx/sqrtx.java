class Solution {
    public int mySqrt(int x) {
       //  1 2 3 4 5 6 7 8
       long i = 1;
       long j = x;
       long ans = 0;

       while(i <= j) {
        long mid = i + (j-i)/2;

        if(mid*mid <= x){
            ans = mid;
            i = mid + 1;
        }
        else if(mid*mid > x){
            j = mid - 1;
        }
      
       }
       return (int)ans;
    }
}