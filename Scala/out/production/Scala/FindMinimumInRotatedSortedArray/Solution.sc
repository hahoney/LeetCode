
object Solution {
  def finMin(num: Array[Int]): Int = {
    @tailrec
    def binaryFind(begin: Int, end: Int): Int = {
      if (begin >= end) {
        num(end)
      }
      else {
        val mid = (begin + end) / 2
        if (num(mid) >= num(end)) {
          binaryFind(mid + 1, end)
        } else if (num(mid) <= num(begin)) {
          binaryFind(begin, mid)
        } else {
          num(begin)
        }
      }
    }
    binaryFind(0, num.length - 1)
  }
}

val num = Array(3, 4, 5, 6, 7, 8, 1, 2)
Solution.finMin(num)




