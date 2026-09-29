class Solution {
    public int smallestEvenMultiple(int n) {
        // for(int i=0; i<151; i++){
        //     if((i+1)%2==0 && (i+1)%n==0){
        //         return i+1;
        //     }
        // }
        // return 0;

        if(n%2 == 0){
            return n;
        }
   
            return 2*n;
        
    }
}