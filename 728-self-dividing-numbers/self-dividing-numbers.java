class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        int ld = 0;
        int orig = 0;
        boolean isFlag = true;

        for(int i=left; i<=right; i++){
            isFlag = true;
             orig = i;
                 if(i<10){
                    list.add(i);
                 }
                 else{
                    while(orig>0){
                     ld = orig%10;
                   
                   if(ld == 0 || i%ld != 0){
                    isFlag = false;
                    break;
                   }
                 
                    orig = orig/10;
                    }
                    if(isFlag == true) list.add(i);
                    
                 }
        }
        return list;
    }
}