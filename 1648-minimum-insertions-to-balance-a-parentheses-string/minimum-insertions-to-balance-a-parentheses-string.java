
class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                // Closing pair ka pehla ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    // Ek ')' missing hai
                    insertions++;
                }

                if (open > 0) {
                    open--;
                } else {
                    // Matching '(' missing hai
                    insertions++;
                }
            }
        }

        return insertions + 2 * open;
    }
}