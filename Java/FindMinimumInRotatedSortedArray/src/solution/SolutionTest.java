package solution;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

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
    }
}