class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        int dominant = 0;

        for(int i=0; i<n; i++){
            float average = 0;
            float left = 0;
            float right = 0;
            float div = 0;

            if(i-1 >= 0){
                left = nums[i-1];
                div++;
            }
            if(i+1 < n){
                right = nums[i+1];
                div++;
            }
            if(div != 0){
            average = (left + right)/div;
            }
            

            if(average <= nums[i]) dominant++;
        }
        return dominant;
    }
}