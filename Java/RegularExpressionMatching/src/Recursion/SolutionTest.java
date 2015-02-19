package Recursion;

import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void testIsMatch() throws Exception {
        Solution sol = new Solution();
        // NULL check
        assert(sol.isMatch("", "") == true);
        assert(sol.isMatch("", "a") == false);
        assert(sol.isMatch("a", "") == false);
        // . match
        assert(sol.isMatch("abcf", "..cf") == true);
        assert(sol.isMatch("asd", "....") == false);
        // * match
        assert(sol.isMatch("aaaaa", "a*") == true);
        assert(sol.isMatch("aaaa", ".*") == true);
    }
}