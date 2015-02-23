package FindMinimumInRotatedSortedArray_Dup

import org.scalatest.FunSuite

class SolutionTest extends FunSuite {
  val sol = new Solution
  test("Test single element") {
    val num1 = Array(0)
    assert(sol.findMin(num1) == 0)
  }
  test("Test unrotated array") {
    val num2 = Array(1, 2, 3, 4, 5, 6)
    assert(sol.findMin(num2) == 1)
  }
  test("Test rotated array") {
    val num3 = Array(3, 4, 5, 6, 1, 2)
    assert(sol.findMin(num3) == 1)
  }
  test("Test unrotated dup0") {
    val num4 = Array(1, 2, 3, 4, 4, 5, 5, 6)
    assert(sol.findMin(num4) == 1)
  }
  test("Test unrotated dup1") {
    val num5 = Array(1, 3, 3, 3, 3, 3, 3, 3)
    assert(sol.findMin(num5) == 1)
  }
  test("Test rotated dup0") {
    val num6 = Array(3, 3, 3, 1, 3, 3, 3, 3)
    assert(sol.findMin(num6) == 1)
  }
  test("Test rotated dup1") {
    val num6 = Array(2, 0, 1, 1, 1)
    assert(sol.findMin(num6) == 0)
  }
  test("Test rotated dup2") {
    val num6 = Array(2, 2, 2, 0, 2, 2)
    assert(sol.findMin(num6) == 0)
  }
}
