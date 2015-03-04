class MinStack:
    def __init__(self):
        self.mainStack = []
        self.minStack = []

    # @param x, an integer
    # @return an integer
    def push(self, x):
        self.mainStack.append(x)
        if (self.minStack and self.minStack[-1] >= x) or not self.minStack:
            self.minStack.append(x)

    # @return nothing
    def pop(self):
        peek = self.mainStack.pop()
        if self.minStack and self.minStack[-1] == peek:
            self.minStack.pop()

    # @return integer
    def top(self):
        assert self.mainStack
        return self.mainStack[-1]

    # @return integer
    def getMin(self):
        assert self.minStack
        return self.minStack[-1]

