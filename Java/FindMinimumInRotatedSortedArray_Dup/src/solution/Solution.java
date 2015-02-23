package solution;

public class Solution {
    public int findMin(int[] num) {
        assert(num != null && num.length != 0);
        int begin = 0;
        int end = num.length - 1;
        int minDup = num[begin];
        while (begin < end) {
            if (num[begin] < num[end]) {
                break;
            }
            if (num[begin] == num[end]) {
                minDup = minDup < num[begin] ? minDup : num[begin];
                begin++;
                end--;
            } else {
                int mid = begin + (end - begin) / 2;
                if (num[mid] <= num[end]) {
                    end = mid;
                } else {
                    begin = mid + 1;
                }
            }
        }
        return num[begin] < minDup ? num[begin] : minDup;
    }
}
