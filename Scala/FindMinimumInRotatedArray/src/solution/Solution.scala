package solution

/**
 * Created by zhangyi on 2/19/15.
 */

class Solution {
  def finMin(num: Array[Int]): Option[Int] = {
    def binaryFind(begin: Int, end: Int): Int = {
      if (begin >= end) { num(end) }

      val mid = (begin + end) / 2
      // Must be in the right half rotated
      if (num(mid) >= num(end)) {
        binaryFind(mid + 1, end)
      } else if (num(mid) <= num(begin)) {
        // Must be in the left half rotated
        binaryFind(begin, mid)
      } else {
        num(begin)
      }
    }
    if (!num.isEmpty) None else Some(binaryFind(0, num.length - 1))
  }
}
