package Q4MedianOfTwoSortedArrays;

/**
 * Created by zhangyi on 3/25/17.
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int l = (len1 + len2 + 1) / 2;
        int r = (len1 + len2 + 2) / 2;
        return (getkth(nums1, 0, len1 - 1, nums2, 0, len2 - 1, l) + getkth(nums1, 0, len1 - 1, nums2, 0, len2 - 1, r)) / 2.0;
    }

    private int getkth(int s[], int ms, int me, int l[], int ns, int ne, int k) {
        int len1 = me - ms + 1;
        int len2 = ne - ns + 1;
        if (len1 > len2) {
            return getkth(l, ns, ne, s, ms, me, k);
        }
        if (len1 == 0) {
            return l[ns + k - 1];
        }
        if (k == 1) {
            return Math.min(s[ms], l[ns]);
        }

        int i = ms + Math.min(len1, k / 2) - 1; // ith element in s, k must > 1
        int j = ns + Math.min(len2, k / 2) - 1; // jth element in l
        if (s[i] > l[j]) {
            return getkth(s, ms, me, l, j + 1, ne, k - j + ns - 1);
        }
        return getkth(s, i + 1, me, l, ns, ne, k - i + ms - 1);
    }

}
