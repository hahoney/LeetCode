package Q8StringToInteger;

/**
 * Created by zhangyi on 3/26/17.
 */
public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        str = str.trim();
        int sign = 1;
        int strPoint = 0;
        if (str.charAt(strPoint) == '+') {
            strPoint++;
        } else if (str.charAt(strPoint) == '-') {
            sign = -1;
            strPoint++;
        }
        long result = 0;
        for (int i = strPoint; i < str.length(); i++) {
            int number = str.charAt(i) - '0';
            if (number >= 10 || number < 0) {
                break;
            }
            result = result * 10 + number;
            if (result > (long) Integer.MAX_VALUE + 1) {
                break;
            }
        }
        result = result * sign;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }

    public static void main(final String[] args) {
        Solution sol = new Solution();
        String str = String.valueOf(Integer.MIN_VALUE);
        str = "-2147483649";
        System.out.print(sol.myAtoi(str));
    }
}
