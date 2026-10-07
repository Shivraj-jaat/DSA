class Solution {

    public int length(String s){
        char[] arr = s.toCharArray();
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                count++;
            }
        }
        return count+1;
    }


    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        for(int i=0; i<n; i++){
            max = Math.max(max, length(sentences[i]));
        }
        return max;
    }
}