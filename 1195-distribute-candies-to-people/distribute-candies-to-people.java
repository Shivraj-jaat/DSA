class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;

      while(candies > 0){
            if(candies > i+1){
                  ans[i%num_people] += i+1;
                  candies -= i+1;
            }
            else{
                  ans[i%num_people] += candies;
                  break;
            }
            i++;
       
        }
        return ans;
    }
}