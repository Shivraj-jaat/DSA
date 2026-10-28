class Solution {
    public boolean lemonadeChange(int[] bills) {
        int countFive = 0;
        int countTen = 0;
        int countTwenty = 0;

        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5){
                countFive++;
            }
            else if(bills[i] == 10){
              
                if(countFive == 0){
                    return false;
                }
                else{
                      countTen++;
                    countFive--;
                }
            }
            else{
                if(countTen >= 1 && countFive >= 1){
                    countTen--;
                    countFive--;
                }
                else if(countFive >= 3){
                   countFive = countFive - 3;
                }
                else{
                   return false;
                }
            }
        }
        return true;
    }
}