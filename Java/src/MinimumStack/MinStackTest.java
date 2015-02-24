package MinimumStack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {
    MinStack min = new MinStack();
    @Test
    public void testPush() throws Exception {
        min.push(0);
        min.push(1);
        min.push(0);
        assertEquals(min.getMin(), 0);
        min.pop();
        assertEquals(min.getMin(), 0);
    }
}