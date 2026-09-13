class Solution {
    public int smallestEqual(int[] nums) {
        int mod = Integer.MAX_VALUE;
        int sMod = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
             if(i % 10 == nums[i]){
            mod = i;
             }
             sMod = Math.min(sMod, mod);
        }
        if(sMod == Integer.MAX_VALUE) return -1;
        return sMod;
    }
}