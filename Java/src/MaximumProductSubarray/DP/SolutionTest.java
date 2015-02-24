package MaximumProductSubarray.DP;

public class SolutionTest {

    @org.junit.Test
    public void testMaxProduct() throws Exception {
        Solution sol = new Solution();
        int [] test1 = {};
        assert (sol.maxProduct(test1) == 0);
        int [] test2 = {1, 2, 3, 4, 5, 6};
        assert (sol.maxProduct(test2) == 1 * 2 * 3 * 4 * 5 * 6);
        int [] test3 = {1, 2, 0, 3, 0, 4, 5, 6};
        assert (sol.maxProduct(test3) == 4 * 5 * 6);
        int [] test4 = {1, 2, 0, 3, 0, 4, -5, 6};
        assert (sol.maxProduct(test4) == 6);
        int [] test5 = {0, 0, 0, 0, 0, 0, 0, 0};
        assert (sol.maxProduct(test5) == 0);
        int [] test6 = {-2, 0, -1};
        assert (sol.maxProduct(test6) == 0);
        int [] test7 = {-4, -3, -2};
        assert (sol.maxProduct(test7) == 12);
        int [] test8 = {-1, -2, -9, -6};
        assert (sol.maxProduct(test8) == 1 * 2 * 9 * 6);
    }
}