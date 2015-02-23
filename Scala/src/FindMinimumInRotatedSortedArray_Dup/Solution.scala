package FindMinimumInRotatedSortedArray_Dup

class Solution {
   def findMin(num: Array[Int]): Int = {
     def binaryFind(begin: Int, end: Int): Int = {
       if (begin < end) {
         if (num(begin) < num(end)) {
           num(begin)
         } else if (num(begin) == num(end)) {
           math.min(num(begin), binaryFind(begin + 1, end - 1))
         } else {
           val mid = begin + (end - begin) / 2
           if (num(mid) <= num(end)) {
             binaryFind(begin, mid)
           } else {
             binaryFind(mid + 1, end)
           }
         }
       } else {
         num(begin)
       }
     }
     binaryFind(0, num.length - 1)
   }
 }
