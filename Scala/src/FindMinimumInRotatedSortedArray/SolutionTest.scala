package FindMinimumInRotatedSortedArray

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
}
