class Solution {
    public void reverse(char[] arr, int i, int j){
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] == ch){
                reverse(arr, 0, i);
                break;
            }
        }
        return new String(arr);
    }
}