class Solution {
    public boolean isPerfectSquare(int num) {
       /*
       1 4 9 16 25 36 49 64 81 100 
       */ 
    //    for(long i=0; i*i<num; i++){
    //       if((i+1)*(i+1) == num){
    //         return true;
    //       }


    /* 
       1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16  
    */

    long i = 0;
    long j = num;

    while(i <= j){
        long mid = i + (j-i)/2;

        if(mid*mid == num){
            return true;
        }
        else if(mid*mid > num){
            j = mid-1;
        }
        else{
            i = mid+1;
        }
    }
       return false;
}}