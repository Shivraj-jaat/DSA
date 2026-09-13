class Solution {
    public int maxProduct(int n) {
        int prod = 1;
        int maxProd = 0;
        ArrayList<Integer> list = new ArrayList<>();
        

        while(n > 0){
           list.add(n%10);
            n = n/10;
        }
         Collections.sort(list);
       int i = 0;
       int j = i + 1;
       while(j < list.size()){
           prod = list.get(i) * list.get(j);
           i++;
           j++;
           maxProd = Math.max(prod, maxProd);

       }
     return maxProd;   
    }
}