package solutions.leetcode.easy

import org.scalatest.funsuite.AnyFunSuite

class MeanOfArrayAfterRemovingSomeElementsTest extends AnyFunSuite {
  test("Example 1") {
    val arr = Array(6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0)
    val expected = 4.00000
    assert(math.abs(MeanOfArrayAfterRemovingSomeElements.trimMean(arr) - expected) < 1e-5)
  }

  test("Example 2") {
    val arr = Array(1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3)
    val expected = 2.00000
    assert(math.abs(MeanOfArrayAfterRemovingSomeElements.trimMean(arr) - expected) < 1e-5)
  }

  test("Edge case: All same elements") {
    val arr = Array.fill(100)(5)
    val expected = 5.00000
    assert(math.abs(MeanOfArrayAfterRemovingSomeElements.trimMean(arr) - expected) < 1e-5)
  }
}
