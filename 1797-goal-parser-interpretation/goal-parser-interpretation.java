class Solution {
    public String interpret(String command) {
        /* G ( ) ( a l ) */
        char[] arr = command.toCharArray();
        int n = arr.length;
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<n; i++){
            if(arr[i] == 'G'){
                sb.append("G");
            }
            else if(arr[i]=='(' && arr[i+1]==')'){
                sb.append("o");
            }
            else if(arr[i]=='(' && arr[i+1]=='a' && arr[i+2]=='l' && arr[i+3]==')' ){
                sb.append("al");
            }
        }
        return sb.toString();
    }
}