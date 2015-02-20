package solution

class Solution {
  def finMin(num: Array[Int]): Int = {
    def binaryFind(begin: Int, end: Int): Int = {
      if (begin < end) {
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
      } else {
        num(end)
      }
    }
    binaryFind(0, num.length - 1)
  }
}
