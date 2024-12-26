package org.solutions.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/check-if-n-and-its-double-exist">...</a>
 * 2 ms beats 90.44%
 * 42.91 mb beats 71.29%
 */

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        Set<Integer> nums = new HashSet<>();

        for (int num : arr) {
            if (nums.contains(num * 2) || nums.contains(num / 2) && num % 2 == 0) {
                return true;
            }

            nums.add(num);
        }

        return false;
    }
}
