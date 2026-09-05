class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxProfit = 0;
        int i = 0;
        int j = i+1;

        while(j<prices.length){
            if(prices[j]>prices[i]){
            profit = prices[j] - prices[i];
            j++;
            }
            else{
                i = j;
                j++;
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}