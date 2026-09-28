class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int i = 0;
         int j = 0;
         int total_sum = 0;
         int sum = 0;
         int answer = 0;

         for(int p=0; p<n; p++){
            total_sum += cardPoints[p];
         }
         if(n == k){
            return total_sum;
         }

         while(j < n){
           sum += cardPoints[j];
           if(j-i+1 < n - k){
            j++;
           } else{
            answer = Math.max(answer, total_sum-sum);
            sum -= cardPoints[i];
            i++;
            j++;
           }
         }
         return answer;
    }
}