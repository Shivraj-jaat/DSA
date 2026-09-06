class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int i=0; i<candyType.length; i++){
            map.put(candyType[i], map.getOrDefault(candyType[i], 0) + 1);
        }

        int chosenCandy = candyType.length/2;

        if(map.size() <= chosenCandy){
            ans = map.size();
        }
        else{
            ans = chosenCandy;
        }
        return ans;
    }
}