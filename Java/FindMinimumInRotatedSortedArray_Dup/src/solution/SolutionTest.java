package solution;

import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void testFinMin() throws Exception {
        Solution sol = new Solution();
        //sol.findMin(test1);
        // test single element array
        int[] test2 = {1};
        assertEquals(sol.findMin(test2), 1);
        // test unrotated array
        int[] test3 = {1, 2, 3, 4, 5, 6};
        assertEquals(sol.findMin(test3), 1);
        // test rotate one number
        int[] test4 = {2, 3, 4, 5, 6, 1};
        assertEquals(sol.findMin(test4), 1);
        // test rotate last number
        int[] test5 = {6, 1, 2, 3, 4, 5};
        assertEquals(sol.findMin(test5), 1);
        // test duplicate
        int[] test6 = {2, 2, 2, 2, 1, 2, 2};
        assertEquals(sol.findMin(test6), 1);
        // test duplicate
        int[] test7 = {1, 2, 2, 2, 2, 2, 2};
        assertEquals(sol.findMin(test7), 1);
        // test duplicate
        int[] test8 = {2, 0, 1, 1, 1};
        assertEquals(sol.findMin(test8), 0);
        // test duplicate

        int[] test9 = {1, 1};
        assertEquals(sol.findMin(test9), 1);
    }
}