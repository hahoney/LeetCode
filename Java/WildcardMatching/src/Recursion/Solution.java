package Recursion;

/***
 *   A naive solution based on recursion.
 */

public class Solution {
    public boolean isMatch(String s, String p) { 
        if ("".equals(p)) {
            return "".equals(s);
        }
        if ("".equals(s)) {
            if (p.charAt(0) == '*') {
                return isMatch(s, p.substring(1));
            } else {
                return false;
            }
        }
        
        if (p.charAt(0) == '*') {
            return isMatch(s.substring(1), p) || isMatch(s, p.substring(1));
        }
        if (p.charAt(0) == '?') {
            return isMatch(s.substring(1), p.substring(1));
        }
        return s.charAt(0) == p.charAt(0) && isMatch(s.substring(1), p.substring(1));
    }
}