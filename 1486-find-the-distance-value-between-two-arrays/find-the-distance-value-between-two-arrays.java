class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        int m = arr2.length;
        boolean isAns = true;
        int count = 0;

        for(int i=0; i<n; i++){
            isAns = true;
            for(int j=0; j<m; j++){
                if(Math.abs(arr1[i]-arr2[j]) <= d) isAns = false;
            }
            if(!isAns) count++;
        }
        return n-count;
    }
}