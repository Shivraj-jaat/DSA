class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n = plants.length;
        int orig = capacity;
        int count = 0;

        for(int i=0; i<n; i++){
            if(plants[i] <= capacity){
                capacity -= plants[i];
                count++;
            }
            else{
                count += i;
                count += i+1;
                capacity = orig;
                capacity -= plants[i];
            }
        }
        return count;
    }
}