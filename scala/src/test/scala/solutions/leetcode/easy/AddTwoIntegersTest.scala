package solutions.leetcode.easy

import org.scalatest.funsuite.AnyFunSuite

class AddTwoIntegersTest extends AnyFunSuite {

  test("sum of 1 and 2 should be 3") {
    assert(AddTwoIntegers.sum(1, 2) == 3)
  }

  test("sum of -1 and 1 should be 0") {
    assert(AddTwoIntegers.sum(-1, 1) == 0)
  }
}
