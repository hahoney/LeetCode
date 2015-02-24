package MinimumStack;

import java.util.*;

class MinStack {
    // Linked list is slower than ArrayDeque
    Deque<Integer> mainStack = new ArrayDeque<Integer>();
    Deque<Integer> minStack = new ArrayDeque<Integer>();

    public void push(int x) {
        mainStack.push(x);
        if ((!minStack.isEmpty() && minStack.peek() >= x) || minStack.isEmpty()) {
            minStack.push(x);
        }
    }

    public void pop() {
        assert(!mainStack.isEmpty());
        int peek = mainStack.pop();
        if (!minStack.isEmpty() && peek == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        assert(!mainStack.isEmpty());
        return mainStack.peek();
    }

    public int getMin() {
        assert(!minStack.isEmpty());
        return minStack.peek();
    }
}
