class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i=0; i<n; i++){
            int a = -1;
            int b = -1;
            int c = -1;

            if(map.get(nums[i]) == 3){
                for(int j=i; j<n; j++){
                    if(nums[j] == nums[i] && a == -1){
                        a = j;
                    }
                    else if(nums[j] == nums[i] && b == -1){
                        b = j;
                    }
                    else if(nums[j] == nums[i] && c == -1){
                        c = j;
                    }
                     
                }
                 if(b-a == c-b) count++;
                 map.put(nums[i], map.getOrDefault(nums[i], 0)-1);
            }
            
          
        }
        return count;
    }
}