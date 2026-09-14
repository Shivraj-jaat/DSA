class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0; i<n; i++){
       if(max < arr[i]){
        max = arr[i];
        idx = i;
       }

        }
        return idx;
    }
}