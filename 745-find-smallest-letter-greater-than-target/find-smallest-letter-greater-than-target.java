class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int l = 0;
        int h = n-1;
        char ch = ' ';

        while(l <= h){
            int mid = l + (h-l)/2;

            if(letters[mid] > target){
                 ch = letters[mid];
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        if(ch == ' ') return letters[0];
        return ch;
    }
}