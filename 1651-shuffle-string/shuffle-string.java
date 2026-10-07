class Solution {
    public String restoreString(String s, int[] indices) {
          int n = s.length();
          char[] arr = new char[n];

          for(int i=0; i<n; i++){
            int idx = indices[i];
            char ch = s.charAt(i);
            arr[idx] = ch;
          }
    return new String(arr);
    }
}