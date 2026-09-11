class Solution {
    public boolean isHappy(int n) {
        /*
        64 + 91
            2 4 16 37 58 89 155 51 26 40 16 
        */
       
        boolean ans = false;
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
             int sum = 0;
            while(n > 0){
                int ld = n%10;
                n = n/10;
                sum = sum + ld*ld;
            }
            n = sum;
            if(set.contains(sum)){
                return false;
            }
            else{
                 set.add(sum);
            }
           
        }
        return true;
    }
}