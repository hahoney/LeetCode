package Q6ZigZagConversion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyi on 3/26/17.
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<List<Character>> map = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            map.add(new ArrayList<Character>());
        }
        int rowNumber = 0;
        int direction = 1;
        for (int i = 0; i < s.length(); i++) {
            List<Character> list = map.get(rowNumber);
            list.add(s.charAt(i));
            rowNumber += direction;
            if (rowNumber == numRows - 1 || rowNumber == 0) {
                direction *= -1;
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (Character eachChar : map.get(i)) {
                resultBuilder.append(eachChar);
            }
        }
        return resultBuilder.toString();
    }

    public static void main(final String [] args) {
        Solution sol = new Solution();
        System.out.print(sol.convert("PAYPALISHIRING", 2));
    }
}
