class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
 
        Arrays.sort(trainers);
        Arrays.sort(players);

        int matched = 0;

        int i = 0;
        int j = 0;

        while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]){
                matched++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
     
    return matched;
    }
}