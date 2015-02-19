package DP;

/**
 * Created by zhangyi on 2/18/15.
 */
public class Solution {
    public int maxProduct(int[] A) {
        if (A.length == 0) { return 0; }
        int largest = 1;
        int smallest = 1;
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            int largestNew = max(A[i], largest * A[i], smallest * A[i]);
            smallest = min(A[i], largest * A[i], smallest * A[i]);
            largest = largestNew;
            maxProd = maxProd >= largest ? maxProd : largest;
        }
        return maxProd;
    }

    private int max(int a, int b, int c) {
        int temp = a > b ? a : b;
        return c > temp ? c : temp;
    }

    private int min(int a, int b, int c) {
        int temp = a < b ? a : b;
        return c < temp ? c : temp;
    }
}