package MaximumProductSubarray.Recursion;

/**
 *  Greedy Algorithm, reset zero when the product turns zero
 */
public class Solution {
    public int maxProduct(int[] A) {
        if (A.length == 0) { return 0; }

        int leftProd = 1;
        int rightProd = 1;
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            leftProd *= A[i];
            rightProd *= A[A.length - i - 1];
            // zero is not special
            int tempMax = leftProd > rightProd ? leftProd : rightProd;
            maxProd = maxProd > tempMax ? maxProd : tempMax;
            if (leftProd == 0) {
                leftProd = 1;
            }
            if (rightProd == 0) {
                rightProd = 1;
            }
        }
        return maxProd;
    }
}
