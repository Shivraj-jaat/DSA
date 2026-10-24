class Solution {
    public int isMin(int i, int n, int[] prices){
        int min = prices[i-1];
        for(int p=i; p<n; p++){
            if(min >= prices[p]){
                return prices[p];
            }
        }
        return 0;
    }
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int min = isMin(i+1, n, prices);
            ans[i] = prices[i] - min;
        }
        return ans;
    }
}