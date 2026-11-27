class Solution {
    public boolean canAliceWin(int n) {
        int aliceRemove = 10;
        int bobRemove = 0;
        boolean isFlag = true;
        while(n >= bobRemove || n >= aliceRemove){
            if(n >= aliceRemove && isFlag){
                n = n - aliceRemove;
                bobRemove = aliceRemove-1;
                isFlag = false;
            }
            else if(n >= bobRemove && !isFlag){
                n = n - bobRemove;
                aliceRemove = bobRemove-1;
                isFlag = true;
            }
            else{
                return false;
            }
        }
        if(isFlag == true){
            return false;
        }
        return true;
    }
}