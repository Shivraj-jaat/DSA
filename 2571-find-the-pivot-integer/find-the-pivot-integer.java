class Solution {
    public int pivotInteger(int n) {
        /* 
        1 2 3 4 5 6 7 8
      p 1 3 6 10 15 21 28 36
      s 36 35 33 30 26 21 15  8
        */
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        suffix[n-1] = n;
        

        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + (i+1);
            suffix[n-1-i] = suffix[n-i] + (n-i);
        }

        for(int i=0; i<n; i++){
            if(prefix[i] == suffix [i]){
                return i+1;
            }
        }
        return -1;
    }
}