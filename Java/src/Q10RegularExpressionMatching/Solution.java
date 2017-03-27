package Q10RegularExpressionMatching;

/**
 * Created by zhangyi on 3/26/17.
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        boolean[][] match = new boolean[s.length() + 1][p.length() + 1];
        match[0][0] = true;
        /**
         * 1. No need to initialize match[:][0] because they are all false
         */
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && (match[0][i - 1] || (i > 1 && match[0][i-2]))) {
                match[0][i + 1] = true;
            }
        }

    }
}
