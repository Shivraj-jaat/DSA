class Solution {
    public boolean canWinNim(int n) {
        /* 
        1 2 3 4 5 
        */
        if(n<=3){
            return true;
        }
       else if(n%4 == 0){
        return false;
       }
       return true;
    }
}