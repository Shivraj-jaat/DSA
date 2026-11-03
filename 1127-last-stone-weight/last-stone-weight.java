class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

       if(n==1) return stones[0];

        for(int i=n-1; i>0; i--){
             Arrays.sort(stones);
            int max = stones[n-1];
            int smax = stones[n-2];

            if(max == smax){
                stones[n-1] = 0;
                stones[n-2] = 0;
            }
            else if(max > smax){
                stones[n-2] = 0;
                stones[n-1] = max-smax;
            }
        }
        return stones[n-1];
    }
}