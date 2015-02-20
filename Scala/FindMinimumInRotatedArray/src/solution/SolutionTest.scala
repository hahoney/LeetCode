package solution

import org.scalatest.FunSuite

/**
 * Created by zhangyi on 2/19/15.
 */

class SolutionTest extends FunSuite {
  val sol = new Solution
  test("Test single element") {
    val num1 = Array(0)
    assert(sol.finMin(num1) == 0)
  }
  test("Test rotated array with two elements") {
    val num2 = Array(2, 1)
    assert(sol.finMin(num2) == 1)
  }
  test("Test rotated array with duplicate elements") {
    val num3 = Array(1, 0, 0, 0, 0)
    assert(sol.finMin(num3) == 0)
  }
  test("Test unrotated array") {
    val num4 = Array(1, 2, 3, 4, 4, 5, 6)
    assert(sol.finMin(num4) == 1)
  }
}
