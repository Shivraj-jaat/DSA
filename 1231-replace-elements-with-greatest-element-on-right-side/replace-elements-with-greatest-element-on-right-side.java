class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
     
        int p = 0;
        while(p<n){
               int max = Integer.MIN_VALUE;
            for(int i=p+1; i<n; i++){
                max = Math.max(max, arr[i]);
            }
        if(p == n-1){
            arr[p] = -1;
            p++;
        }
        else{
            arr[p] = max; 
            p++;
        }

        }
        return arr;
    }
}