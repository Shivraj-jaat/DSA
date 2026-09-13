class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int prefix = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            prefix += gain[i];
            max = Math.max(max, prefix);
        }
        if(max < 0) return 0;
        return max;
    }
}