package MinStack

import org.scalatest.FunSuite

class MinStackTest extends FunSuite {
  val minStack = new MinStack()
  test("Test case 1") {
    minStack.push(0)
    minStack.push(1)
    minStack.push(0)
    assert(minStack.top == 0)
    assert(minStack.getMin() == 0)
    minStack.pop()
    assert(minStack.top == 1)
    assert(minStack.getMin() == 0)
  }
  test("Test case 2") {
    val minStack = new MinStack()
    minStack.push(0)
    assert(minStack.top == 0)
    assert(minStack.getMin() == 0)
  }
}
