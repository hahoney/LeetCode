package Q5LongestPalindromicSubstring;

/**
 * Created by zhangyi on 3/26/17.
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        int maxLength = 0;
        String maxPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            if (maxLength >= s.length() - i) {
                break;
            }
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                } else {
                    break;
                }
            }
            if (right - left - 1 > maxLength) {
                maxPalindrome = s.substring(left + 1, right);
                maxLength = right - left - 1;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                } else {
                    break;
                }
            }
            if (right - left - 1 > maxLength) {
                maxPalindrome = s.substring(left + 1, right);
                maxLength = right - left - 1;
            }
        }
        return maxPalindrome;
    }
}
