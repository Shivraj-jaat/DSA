class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        int total = 0;

        if(n == 1) return cost[0];

        Arrays.sort(cost);
        int i = n-1;
        int j = n-2;
// 1 3 3 3
        while(i >= 0){
            if(j < 0){
                total += cost[i];
            }
            else{
                 total += cost[i] + cost[j];
            }
          
           j = j - 3;
           i = i - 3;
        }
        return total;
    }
}