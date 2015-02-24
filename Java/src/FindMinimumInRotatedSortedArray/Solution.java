package FindMinimumInRotatedSortedArray;

/**
 *  num[mid] < num[hi]: rotated, mid after min
 *  num[mid] > num[lo]: rotated, min after mid
 *  else: un-rotated, return first element
 */
public class Solution {
    public int findMin(int[] num) {
        assert (num != null);
        assert (num.length != 0);

        int begin = 0;
        int end = num.length - 1;

        while (end > begin) {
            int mid = begin + (end - begin) / 2;
            if (num[mid] < num[end]) {
                end = mid;
            } else if (num[mid] >= num[begin]) {
                begin = mid + 1;
            } else {
                break;
            }
        }
        return num[begin];
    }
}
