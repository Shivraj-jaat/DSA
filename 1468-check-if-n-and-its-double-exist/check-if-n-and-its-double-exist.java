class Solution {
    public boolean checkIfExist(int[] arr) {
      HashMap<Integer, Integer> map = new HashMap<>();

      for(int i=0; i<arr.length; i++){
        map.put(arr[i], i);
      }
      int count = 0;
      boolean flag = false;

      for(int i=0; i<arr.length; i++){
        if(arr[i] == 0) count++;
        if(map.containsKey(2 * arr[i]) && arr[i] != 0){
            flag =  true;
        }    
      }    
        if(count > 1) return true;
        return flag;
    }
}