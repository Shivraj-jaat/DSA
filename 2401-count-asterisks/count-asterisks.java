class Solution {
    public int countAsterisks(String s) {
        int n = s.length();
        int count1 = 0;
        int countStar = 0;

        for(int i=0; i<n; i++){

            char ch = s.charAt(i);

            if(ch == '|'){
                count1++;
            }
            else if(count1%2==0 && ch == '*'){
                countStar++;
            }
        }
    return countStar;
    }
}