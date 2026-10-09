class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        char[] arr =  s.toCharArray();

        while(i < j){
            // char ch1 = s.charAt(i);
            // char ch2 = s.charAt(j);
          

            if(!((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z'))){
                    i++;
            } 
            else if(!((arr[j] >= 'A' && arr[j] <= 'Z') || (arr[j] >= 'a' && arr[j] <= 'z'))){
                    j--;
            }
            else{
                char temp = arr[i];
               arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}