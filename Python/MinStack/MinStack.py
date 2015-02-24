class MinStack:
    mainStack = []
    minStack = []

    def push(self, x):
        self.mainStack.append(x)
        if (self.minStack and self.minStack[-1] >= x) or not self.minStack:
            self.minStack.append(x)

    def pop(self):
        peek = self.mainStack.pop()
        if self.minStack and self.minStack[-1] == peek:
            self.minStack.pop()

    def top(self):
        assert self.mainStack
        return self.mainStack[-1]

    def getMin(self):
        assert self.minStack
        return self.minStack[-1]

