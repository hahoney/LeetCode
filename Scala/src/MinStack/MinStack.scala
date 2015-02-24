package MinStack

import scala.collection.mutable.Stack

class MinStack {
  private val mainStack: Stack[Int] = Stack()
  private val minStack: Stack[Int] = Stack()

  def push(x: Int) = {
    mainStack.push(x)
    if ((!minStack.isEmpty && minStack.top >= x) || minStack.isEmpty) {
      minStack.push(x)
    }
  }

  def pop() = {
    assert(!mainStack.isEmpty)
    val peek: Int = mainStack.pop()
    if (!minStack.isEmpty && peek == minStack.top) {
      minStack.pop()
    }
  }

  def top() = {
    assert(!mainStack.isEmpty)
    mainStack.top
  }

  def getMin() = {
    assert(!minStack.isEmpty)
    minStack.top
  }
}
