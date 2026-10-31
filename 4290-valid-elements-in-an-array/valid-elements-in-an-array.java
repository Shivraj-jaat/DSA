class Solution {

    public boolean isLeftGreater(int i, int[] nums){
        int j = 0;
        boolean isFlag = true;
        for(j = 0; j < i; j++){
              if(nums[j] >= nums[i]){
                isFlag = false;
                break;
              }
        }
        return isFlag;
    } 
    
      public boolean isRightGreater(int i, int[] nums){
        int j = 0;
        boolean isFlag = true;
        for(j = i+1; j < nums.length; j++){
              if(nums[j] >= nums[i]){
                isFlag = false;
                break;
              }
        }
        return isFlag;
    }

    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(i == 0){
                list.add(nums[i]);
                continue;
            }
            else if( i == n-1){
                list.add(nums[i]);
                continue;
            }
            boolean ans1 = isLeftGreater(i, nums);
            boolean ans2 = isRightGreater(i, nums);

            if(ans1 || ans2){
            list.add(nums[i]);
        }
        }
        
        return list;
    }
}