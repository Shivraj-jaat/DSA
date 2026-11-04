class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
       for(int i=0; i<n-1; i++){
            min = Math.min(min, arr[i+1]-arr[i]);
       }

        for(int i=0; i<n-1; i++){
            ArrayList<Integer> pair = new ArrayList<>();
            if(arr[i+1]-arr[i] == min){
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                  list.add(pair);
            }
          
        }
        return list;
    }
}