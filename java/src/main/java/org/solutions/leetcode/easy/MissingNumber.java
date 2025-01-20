package org.solutions.leetcode.easy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/missing-number/description/">...</a>
 * 6 ms - beats 12.40%
 * 45.40 mb - beats 44.86%
 */

// Выгоднее по ресурсам использовать два массива, чем бинарный поиск
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        Arrays.sort(nums);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
