class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        int n = nums.length;
        int sum = 0;

        for(int i=0; i<n; i++){
            count[nums[i]]++;
        }
        for(int i=0; i<101; i++){
            if(count[i]==1){
                sum = sum + i;
            }
        }
        return sum;
    }
}