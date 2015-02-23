package FindMinimumInRotatedSortedArray

class Solution {
  def findMin(num: Array[Int]): Int = {
    def binaryFind(begin: Int, end: Int): Int = {
      if (begin < end) {
        val mid = begin + (end - begin) / 2
        if (num(mid) < num(end)) {
          binaryFind(begin, mid)
        } else if (num(mid) >= num(begin)) {
          binaryFind(mid + 1, end)
        } else {
          num(begin)
        }
      } else {
        num(begin)
      }
    }
    binaryFind(0, num.length - 1)
  }
}
