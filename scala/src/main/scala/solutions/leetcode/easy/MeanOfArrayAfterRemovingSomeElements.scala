package solutions.leetcode.easy

/**
 * https://leetcode.com/problems/mean-of-array-after-removing-some-elements : 1619. Mean of Array After Removing Some Elements
 */

object MeanOfArrayAfterRemovingSomeElements {
  def trimMean(arr: Array[Int]): Double = {
    val size = arr.length
    val trimSize = (size * 0.05).toInt
    val sortedArr = arr.sorted
    val sum = (trimSize until (size - trimSize)).foldLeft(0)(_ + sortedArr(_))

    sum.toDouble / (size - 2 * trimSize)
  }
}
