class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int i = 0;
        int j = n;
        int[] ans = new int[len];

     for(int p=0; p<len; p++){
        if(p%2==0){
            ans[p] = nums[i];
            i++;
        }
        else{
            ans[p] = nums[j];
            j++;
        }
     }
      return ans;
    }
}