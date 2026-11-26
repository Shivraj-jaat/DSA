class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int idx = -1;
        int mini = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
           if(capacity[i] >= itemSize){
            int diff = capacity[i] - itemSize;
              
              if(mini > diff){
                idx = i;
                mini = diff;
              }

           }
        }
    return idx;
    }
}