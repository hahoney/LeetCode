package RegularExpressionMatching;


public class Solution {
    public boolean isMatch(String s, String p) {
        /*
        The base cases must handle conditions when s and p are empty
        '.*' matches empty s. So it should return true if p can be
        reduced to .*
        */
        if ("".equals(p)) {
            return "".equals(s);
        }
        if ("".equals(s)) {
            if (p.length() >= 2 && p.charAt(1) == '*') {
                return isMatch(s, p.substring(2));
            }
            return false;
        }

        /* string p begins with '.*' or any other single character with a '*' */
        if (p.length() >= 2 && p.charAt(1) == '*') {
            if (p.charAt(0) == '.') {
                return isMatch(s, p.substring(2)) || isMatch(s.substring(1), p);
            } else {
                return (p.charAt(0) == s.charAt(0) && isMatch(s.substring(1), p)) || isMatch(s, p.substring(2));
            }
        }

        // string p begins with '.'
        if (p.charAt(0) == '.') {
            return isMatch(s.substring(1), p.substring(1));
        }

        // otherwise use regular matching
        return (s.charAt(0) == p.charAt(0)) && isMatch(s.substring(1), p.substring(1));
    }
}