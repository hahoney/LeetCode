package Q7ReverseInteger;

/**
 * Created by zhangyi on 3/26/17.
 */
public class Solution {
    public int reverse(int x) {
        long result = reverseIntWithLong((long) x);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }

    private long reverseIntWithLong(long xLong) {
        if (xLong < 0) {
            return -reverseIntWithLong(-xLong);
        }
        long result = 0L;
        while (xLong > 0) {
            result = result * 10 + xLong % 10;
            xLong /= 10;
        }
        return result;
    }

    public static void main(final String[] args) {
        Solution sol = new Solution();
        System.out.print(sol.reverse(1534236469));
    }
}
