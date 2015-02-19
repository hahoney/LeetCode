package solution;

/**
 *  num[mid] >= num[hi]: rotated, min after mid
 *  num[mid] <= num[lo]: rotated, mid after min
 *  else: un-rotated, return first element
 */
public class Solution {
    public int findMin(int[] num) {
        assert (num != null);
        assert (num.length != 0);

        int begin = 0;
        int end = num.length - 1;

        while (end > begin) {
            int mid = (begin + end) / 2;
            // the array is rotated and min must be in the right half
            if (num[mid] >= num[end]) {
                begin = mid + 1;
            } else if (num[mid] <= num[begin]) {
                // must be in the left half rotated
                end = mid;
            } else {
                return num[begin];
            }
        }
        return num[end];
    }
}
