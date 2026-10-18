class Solution {
    public boolean checkRecord(String s) {
        int n = s.length();
        int absent = 0;
        int late = 1;
        int idx = -1;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'A'){
                absent++;
                idx = i;
            }
          else  if(ch == 'L'){
               if(idx != -1 && s.charAt(idx) == 'L'){
                late++;
               }
                idx = i;
                if(late >= 3) return false;
            }
            else{
                late = 1;
                idx = -1;
            }
        }

        if(absent < 2 && late < 3) return true;
        return false;
    }
}