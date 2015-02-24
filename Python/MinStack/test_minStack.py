import unittest

from MinStack import *


class TestMinStack(unittest.TestCase):
    def test_minStack1(self):
        minStack = MinStack()
        minStack.push(0)
        minStack.push(1)
        minStack.push(0)
        assert minStack.top() == 0
        assert minStack.getMin() == 0
        minStack.pop()
        assert minStack.top() == 1
        assert minStack.getMin() == 0

def suite():
    suite1 = unittest.TestSuite()
    suite1.addTest(TestMinStack("test_minStack1"))

if __name__ == "__main__":
    runner = unittest.TextTestRunner()
    runner.run("suite")
