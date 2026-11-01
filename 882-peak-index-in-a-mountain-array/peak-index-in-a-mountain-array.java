class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        /*
        0 3 5 11 2 
         */

         int n = arr.length;
         int l = 0;
         int h = n-1;

         while(l <= h){
            int mid = l + (h-l)/2;

            if(mid-1 >= 0 && arr[mid] > arr[mid-1] && mid+1 <= n-1 && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid-1 >= 0 && arr[mid-1] > arr[mid]){
                h = mid-1;
            }
            else if(mid+1 <= n-1 && arr[mid+1] > arr[mid]){
                l = mid+1;
            }
         }
         return 0;
    }
}