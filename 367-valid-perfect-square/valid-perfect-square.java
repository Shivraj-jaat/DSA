class Solution {
    public boolean isPerfectSquare(int num) {
       /*
       1 4 9 16 25 36 49 64 81 100  
       */ 
       for(long i=0; i*i<num; i++){
          if((i+1)*(i+1) == num){
            return true;
          }
       }
       return false;
    }
}