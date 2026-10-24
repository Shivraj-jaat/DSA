class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int prefix = 0;
        int totalSum = 0;

        for(int i=0; i<n; i++){
            prefix = 0;
            for(int j=i; j<n; j++){
                prefix += arr[j];

                 if((j-i+1)%2!=0){
                totalSum += prefix;
                
            }
            }
           
        }
    return totalSum;
    }
}