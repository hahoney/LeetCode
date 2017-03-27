package Q9PalindromeNumber;

/**
 * Created by zhangyi on 3/26/17.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long convertNumber = 0;
        long xLong = x;
        while (xLong > 0) {
            convertNumber = convertNumber * 10 + xLong % 10;
            xLong /= 10;
        }
        return ((long) x) == convertNumber;
    }

    public static void main(final String[] args) {
        Solution sol = new Solution();
        System.out.print(sol.isPalindrome(-2147447412));
    }
}
