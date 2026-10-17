class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int idx = 0;

       
        for(int i=0; i<n; i++){
            if(max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }
         if(n<3 || idx==n-1 || idx==0) return false;


        for(int i=0; i<idx; i++){
            if(arr[i] >= arr[i+1]) return false;
        }
        for(int i=idx; i<n-1; i++){
            if(arr[i] <= arr[i+1]) return false;
        }
        return true;
    }
}