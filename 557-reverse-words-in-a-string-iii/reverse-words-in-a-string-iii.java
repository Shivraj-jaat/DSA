class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

        int i = 0;
        int j = 0;
        int k = 0;


        while(k < n){
      //     let's take
           
            if(k == n-1){
                j = k;
                while(j > i){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
              }
              i = k + 1;
              k++; 
            }
        
            else if(arr[k] == ' '){
                j = k-1;
              while(j > i){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
              }
              i = k + 1;
              k++;   
            }
            else  if(arr[k] != ' '){
                k++;
            }
        }
       return new String(arr);
    }
}