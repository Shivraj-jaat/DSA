class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;

        int i = 0;
        int j = 0;
        int sum = 0;
        int extraSum = 0;
        int maxSum = 0;

      
        while(j < n){
          if(grumpy[j] == 0)  sum += customers[j];

          if(grumpy[j] == 1)  extraSum += customers[j];
           

            if(j-i+1 < minutes){
                j++;
            }
            else{
               maxSum = Math.max(maxSum, extraSum);
               if(grumpy[i] == 1)  extraSum -= customers[i];
               i++;
               j++;
            }
        }
       
       return maxSum+sum;
    }
}